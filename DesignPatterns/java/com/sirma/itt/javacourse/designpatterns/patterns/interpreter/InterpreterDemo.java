package com.sirma.itt.javacourse.designpatterns.patterns.interpreter;

/**
 * ITTE-1908 Interpreter design pattern.
 * 
 * @author Petar Ivanov
 */
public class InterpreterDemo {
	public InterpreterContext context;
	public static String search;

	/**
	 * Constructor
	 * 
	 * @param context
	 *            To interpret.
	 */
	public InterpreterDemo(InterpreterContext context) {
		this.context = context;
	}

	/**
	 * According to keyword, check available Is the sentence and checks in the.
	 * branch.
	 * 
	 * @param sentence
	 *            To interpret.
	 * @return Boolen result from serching.
	 */
	public boolean interpret(String sentence) {
		Expression expression = null;
		if (sentence.toLowerCase().contains("fruit")) {
			expression = new FruitExpression(search);
		} else if (sentence.toLowerCase().contains("vegetable")) {
			expression = new VegetableExpression(search);
		}
		return expression.interpret(context);
	}

	/**
	 * In this case, check fruit or vegetable is onion?
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		InterpreterDemo interpreter = new InterpreterDemo(new InterpreterContext());
		search = "onion";
		String expression = String.format("Is %s fruit? ", search);
		String secondExpression = String.format("Is %s vegetable ? ", search);

		System.out.println(expression + "-" + interpreter.interpret(expression));
		System.out.println(secondExpression + "-" + interpreter.interpret(secondExpression));
	}
}
