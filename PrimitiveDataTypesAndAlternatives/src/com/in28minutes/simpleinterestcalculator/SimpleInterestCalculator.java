package com.in28minutes.simpleinterestcalculator;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
	
	BigDecimal principal;
	BigDecimal interest;

	public SimpleInterestCalculator(String principalString, String interestPercentageString) {
		// TODO Auto-generated constructor stub
		this.principal = new BigDecimal(principalString);
		BigDecimal interestPercentage = new BigDecimal(interestPercentageString);
		this.interest = interestPercentage.divide(new BigDecimal(100));
	}

	public BigDecimal calculateTotalValue(int years) {
		BigDecimal interestTimesYearsBigDecimal = interest.multiply(new BigDecimal(years));
		BigDecimal increasedValueBigDecimal = interestTimesYearsBigDecimal.multiply(principal);
		BigDecimal totalValue = principal.add(increasedValueBigDecimal);
		
		
		return totalValue;
	}

}
