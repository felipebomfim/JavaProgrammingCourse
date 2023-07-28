package com.in28minutes.oops;

public class MotorBykeRunner {

	public static void main(String[] args) {
		MotorByke ducati = new MotorByke();
		MotorByke honda = new MotorByke();
		
		ducati.start();
		honda.start();
		
		ducati.setSpeed(100);
		honda.setSpeed(80);
		
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		
	}

}
