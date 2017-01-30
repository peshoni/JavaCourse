package com.sirma.itt.javacourse.designpatterns.patterns.command;

/**
 * ITTE-1902 Command pattern.
 * 
 * @author Petar Ivanov
 */
public class Multiply implements Command {
	private double result;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public double execute(double firstOperand, double secondOperand) {
		result = firstOperand * secondOperand;
		return result;
	}
}
