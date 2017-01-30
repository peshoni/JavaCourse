package com.sirma.itt.javacourse.networkingandgui.calculator;

/**
 * ITTE-1956 Calculator with GUI. Action multiply.
 * 
 * @author Petar Ivanov
 */
class Multiply implements Command {

	/**
	 * {@inheritDoc}
	 */
	public double execute(double firstOperand, double secondOperand) {
		return firstOperand * secondOperand;
	}
}
