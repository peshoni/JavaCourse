package com.sirma.itt.javacourse.networkingandgui.calculator;

/**
 * ITTE-1956 Calculator with GUI. Command factory use the Command design pattern to create different instances.
 * 
 * @author Petar Ivanov
 */
class CommandFactory {
	/**
	 * Private constructor.
	 */
	private CommandFactory() {
	}

	/**
	 * Creates different instances accordingly operator.
	 * 
	 * @param operator
	 *            Symbol that defines the action
	 * @return Created instance.
	 */
	public static Command createInstance(char operator) {
		switch (operator) {
		case '+':
			return new Sum();
		case '-':
			return new Subtract();
		case '*':
			return new Multiply();
		case '/':
			return new Division();

		default:
			break;
		}
		return null;
	}
}