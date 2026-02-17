package com.kodewala.serialization;

import java.io.Serializable;

public class Banking implements Serializable
{
	int amount ;
	String name ;
	String bankCode;
	
	Banking (int amount , String name , String bankCode){
		super();
		this.amount=amount;
		this.name= name;
		this.bankCode= bankCode;
		
		
	}
	

}
