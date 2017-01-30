package com.sirma.itt.javacourse.designpatterns.patterns.interpreter;

/**
 * ITTE-1908 Interpreter design pattern.
 * 
 * @author Petar Ivanov
 */
public class VegetableExpression implements Expression {
	private String word;

	/**
	 * Constructor
	 * 
	 * @param keyword
	 */
	public VegetableExpression(String keyword) {
		this.word = keyword;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean interpret(InterpreterContext context) {
		return context.isVegetable(this.word);
	}
}
