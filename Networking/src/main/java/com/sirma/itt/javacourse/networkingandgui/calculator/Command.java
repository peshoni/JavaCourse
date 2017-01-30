package com.sirma.itt.javacourse.networkingandgui.calculator;

/**
 * ITTE-1956 Calculator with GUI. Class that executes created by {@link CommandFactory} instances.
 * 
 * @author Petar Ivanov
 */
public interface Command {
	public double execute(double firstOperand, double secondOperand);
}
