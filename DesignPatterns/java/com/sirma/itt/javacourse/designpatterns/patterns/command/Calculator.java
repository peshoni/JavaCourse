package com.sirma.itt.javacourse.designpatterns.patterns.command;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ITTE-1902 Command design pattern.
 * 
 * @author Petar Ivanov
 */
public class Calculator {
	private static final String patternExpression = "([\\d]*[.,]*[\\d]*)+[/^*+-/]+([\\d]*[.,]*[\\d]*)";
	private static final String splitExpression = ("[\\^\\*\\-\\/\\+]");
	private final Pattern pattern = Pattern.compile(patternExpression);
	private static Matcher matcher;
	private Command command = null;
	private String[] operands = null;
	private char operator;
	private double result;

	/**
	 * Calculates result of operation between two numbers.
	 * 
	 * @param expression
	 *            String with expression.
	 * @return result
	 */
	public double calculate(String expression) {
		if (isCalculatable(expression)) {
			operands = expression.split(splitExpression);
			operator = expression.charAt(operands[0].length());
			command = CommandFactory.createInstance(operator);
			result = command.execute(Double.parseDouble(operands[0]), Double.parseDouble(operands[1]));
		} else {
			System.out.println("Sorry, expression is uncalculatable!");
		}
		return result;
	}

	/**
	 * Validate expression.
	 * 
	 * @param expression
	 *            For check.
	 * @return {@link Boolean}.
	 */
	private boolean isCalculatable(String expression) {
		matcher = pattern.matcher(expression);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}
}
