package com.in28minutes.simpleinterestcalculator;

import java.math.BigDecimal;

public class SimpleInterestCalculatorRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00", "7.5");
		BigDecimal totalValueBigDecimal = calculator.calculateTotalValue(5);
		System.out.println(totalValueBigDecimal);
	}

}
