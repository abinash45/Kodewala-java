package com.kodewala.smarthomeappliancesystem;

abstract class Appliance {
	String applianceName;
	boolean isOn;
	
	Appliance (String applianceName){
		this.applianceName=applianceName;
		this.isOn=false;
	}
 abstract void turnOn();
 abstract void turnOff();
 
 void showStatus() {
	 if(isOn) {
		 if (isOn) {
	            System.out.println(applianceName + " is ON.");
	        } else {
	            System.out.println(applianceName + " is OFF.");
	        }
	    }
 }
}