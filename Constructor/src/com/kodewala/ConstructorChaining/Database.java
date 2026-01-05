package com.kodewala.ConstructorChaining;

public class Database {
	String dbName, user , password;
	
	Database (){
	this ("myDb", "Abinash" , "1234");
	}
	
	Database (String dbName, String user , String password){
		this.dbName = dbName ;
		this.user = user ;
		this.password = password;
		connect();
		
	}
	void connect() {
		System.out.println("Connecting to DB :" + dbName + " as " +user);
	}

	public static void main(String[] args) {
	  Database db = new Database ();
	  Database db1 = new Database ("testDB","admin","pass123");
		
	}

}
