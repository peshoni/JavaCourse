package com.sirma.itt.javacourse.networkingandgui.calculator;

/**
 * ITTE-1956 Calculator with GUI.
 * 
 * @author Petar Ivanov
 */
class Calculator {
	private double firstOperand;
	private double secondOperand;
	private char operator;
	private double result;
	private Command command;

	public Calculator() {
	}

	/**
	 * Prepares to execute after each operator impression.
	 */
	public Command prepareToExecute() {
		command = CommandFactory.createInstance(operator);
		return command;
	}

	/**
	 * Execute created instance.
	 * 
	 * @return double with result.
	 */
	public double execute() {
		result = command.execute(firstOperand, secondOperand);
		return result;
	}

	/**
	 * Change sing of the operand.
	 * 
	 * @param operand
	 *            To process.
	 * @return Operand with changed sign.
	 */
	public double changeSign(double operand) {
		if (operand > 0) {
			return operand -= 2 * operand;
		} else if (operand < 0) {
			return operand += 2 * Math.abs(operand);
		}
		return operand;
	}

	/**
	 * Getter method for firstOperand.
	 *
	 * @return the firstOperand
	 */
	public double getFirstOperand() {
		return firstOperand;
	}

	/**
	 * Setter method for firstOperand.
	 *
	 * @param firstOperand
	 *            the firstOperand to set
	 */
	public void setFirstOperand(double firstOperand) {
		this.firstOperand = firstOperand;
	}

	/**
	 * Getter method for secondOperand.
	 *
	 * @return the secondOperand
	 */
	public double getSecondOperand() {
		return secondOperand;
	}

	/**
	 * Setter method for secondOperand.
	 *
	 * @param secondOperand
	 *            the secondOperand to set
	 */
	public void setSecondOperand(double secondOperand) {
		this.secondOperand = secondOperand;
	}

	/**
	 * Getter method for operator.
	 *
	 * @return the operator
	 */
	public char getOperator() {
		return operator;
	}

	/**
	 * Setter method for operator.
	 *
	 * @param operator
	 *            the operator to set
	 */
	public void setOperator(char operator) {
		this.operator = operator;
	}

	/**
	 * Getter method for result.
	 *
	 * @return the result
	 */
	public double getResult() {
		return result;
	}
}
