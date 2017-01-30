package com.sirma.itt.javacourse.designpatterns.patterns.command;

/**
 * ITTE-1902 Command design pattern.
 * 
 * @author Petar Ivanov
 */
public class CommandFactory {
	/**
	 * Private constructor.
	 */
	private CommandFactory() {
	}

	/**
	 * According to the operator creates instance.
	 * 
	 * @param operator
	 * @return
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
		case '^':
			return new Power();

		default:
			break;
		}
		return null;
	}
}