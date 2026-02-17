package com.kodewala.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Driver {

	public static void main(String[] args) {
		Banking acc = new Banking (1000,"Abinash","Banking123");
 try {
	 //Serialization
		FileOutputStream fos = new FileOutputStream ("account.ser");
		ObjectOutputStream oos = new ObjectOutputStream (fos);
		oos.writeObject(acc);
		
		//De-Serialization 
		FileInputStream fis = new FileInputStream("account.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Banking accSer = (Banking) ois.readObject();

		System.out.println(accSer.amount+""+accSer.bankCode+""+accSer.name);
		
	}
 catch (Exception e) {
	 e.printStackTrace();
 }
 

}
}