package com.in28minutes.binumber;

public class Binumber {
	private int number1;
	private int number2;
	
	public Binumber(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	
	public int getNumber1() {
		return number1;
	}
	
	public int getNumber2() {
		return number2;
	}
	
	public int add() {
		return number1+number2;
	}
	
	public int multiply() {
		return number1*number2;
	}
	
	public void doubleNumbers() {
		number1*=2;
		number2*=2;
	}
	
}
