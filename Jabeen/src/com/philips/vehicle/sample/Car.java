package com.philips.vehicle.sample;

public class Car extends Vehicle {

	String brand;
	protected String Type;
	
	public Car() {
		// TODO Auto-generated constructor stub
		brand = "";
		Type ="";
	}
	
	public Car (String regno, String name, int model, String clr, String br, String type) {
		super.setRegNo(regno);
		super.setOwner(name);
		super.setModel(model);
		super.color = clr;
		brand = br;
		Type = type;
	}
	
	
	public void displayProperties() {
		System.out.println("My Vehicle is a Car");
		super.displayProperties();
		System.out.println("Color = "+color);
		System.out.println("Brand ="+brand);
		System.out.println(""+Type);
	}
	
}
