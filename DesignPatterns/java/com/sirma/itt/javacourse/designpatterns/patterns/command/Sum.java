package com.sirma.itt.javacourse.designpatterns.patterns.command;

/**
 * ITTE-1902 Command pattern.
 * 
 * @author Petar Ivanov
 */
public class Sum implements Command {
	/**
	 * {@inheritDoc}
	 */
	@Override
	public double execute(double firstOperand, double secondOperand) {
		return firstOperand + secondOperand;
	}
}
