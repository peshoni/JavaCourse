package com.sirma.itt.javacourse.networkingandgui.calculator;

/**
 * ITTE-1956 Calculator with GUI. Action subtract.
 * 
 * @author Petar Ivanov
 */
class Subtract implements Command {

	/**
	 * {@inheritDoc}
	 */
	public double execute(double firstOperand, double secondOperand) {
		return firstOperand - secondOperand;
	}
}
