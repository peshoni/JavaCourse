package com.sirma.itt.javacourse.networkingandgui.calculator;

/**
 * ITTE-1956 Calculator with GUI. Action sum.
 * 
 * @author Petar Ivanov
 */
class Sum implements Command {

	/**
	 * {@inheritDoc}
	 */
	public double execute(double firstOperand, double secondOperand) {
		return firstOperand + secondOperand;
	}
}
