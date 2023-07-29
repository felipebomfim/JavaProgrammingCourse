package com.in28minutes.binumber;

public class BinumberRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binumber numbers = new Binumber(2,3);
		System.out.println(numbers.add());
		System.out.println(numbers.multiply());
		numbers.doubleNumbers();
		System.out.println(numbers.getNumber1());
		System.out.println(numbers.getNumber2());

	}

}
