package com.philips.vehicle.sample;

public class Vehicle {
	private String regno;
	private String ownername;
	private int yearmodel;
	String color;

    public void setRegNo(String registration) {
    	regno = registration;
    }
   
    public void setOwner (String name) {
    	ownername = name;
    	
    }
    
    public void setModel (int modelno) {
    	yearmodel = modelno;
    }
    
    public void displayProperties() {
    	System.out.println("Registration no ="+regno);
    	System.out.println("Owner = "+ownername);
    	System.out.println("Model = "+yearmodel);
    	
    }
}
