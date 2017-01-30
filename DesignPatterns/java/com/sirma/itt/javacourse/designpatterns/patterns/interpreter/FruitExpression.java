package com.sirma.itt.javacourse.designpatterns.patterns.interpreter;

/**
 * ITTE-1908 Interpreter design pattern.
 * 
 * @author Petar Ivanov
 */
public class FruitExpression implements Expression {
	private String word;

	public FruitExpression(String string) {
		this.word = string;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean interpret(InterpreterContext context) {
		return context.isFruit(this.word);
	}
}
