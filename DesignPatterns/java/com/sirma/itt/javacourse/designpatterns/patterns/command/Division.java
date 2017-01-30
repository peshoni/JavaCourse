package com.sirma.itt.javacourse.designpatterns.patterns.command;

/**
 * ITTE-1902 Command pattern.
 * 
 * @author Petar Ivanov
 */
public class Division implements Command {
	private double result;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public double execute(double firstOperand, double secondOperand) {
		if (secondOperand == 0) {
			System.out.println("No division by zero.");
		} else {
			result = firstOperand / secondOperand;
		}
		return result;
	}
}
