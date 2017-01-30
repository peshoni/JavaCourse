package com.sirma.itt.javacourse.networkingandgui.calculator;

/**
 * ITTE-1956 Calculator with GUI. Action division.
 * 
 * @author Petar Ivanov
 */
class Division implements Command {

	/**
	 * {@inheritDoc}
	 */
	public double execute(double firstOperand, double secondOperand) {
		return firstOperand / secondOperand;
	}
}
