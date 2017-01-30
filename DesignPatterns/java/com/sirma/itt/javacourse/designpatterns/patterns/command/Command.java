package com.sirma.itt.javacourse.designpatterns.patterns.command;

/**
 * ITTE-1902 Command pattern.
 * 
 * @author Petar Ivanov
 */
public interface Command {
	/**
	 * Execute given operation between two operands.
	 * 
	 * @param firstOperand
	 *            To calculate it.
	 * @param secondOperand
	 *            To calculate it.
	 * @return result
	 */
	public double execute(double firstOperand, double secondOperand);
}
