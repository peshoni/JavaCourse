package com.sirma.itt.javacourse.designpatterns.patterns.interpreter;

/**
 * ITTE-1908 Interpreter design pattern.
 * 
 * @author Petar Ivanov
 */

public interface Expression {
	public boolean interpret(InterpreterContext context);
}
