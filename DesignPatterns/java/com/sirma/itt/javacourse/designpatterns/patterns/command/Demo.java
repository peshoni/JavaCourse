package com.sirma.itt.javacourse.designpatterns.patterns.command;

import java.util.Scanner;

/**
 * ITTE-1902 Command design pattern. Use pattern contains oerand, operator and
 * operand
 * 
 * @author Petar Ivanov
 */
public class Demo {
	/**
	 * Private constructor.
	 */
	private Demo() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter expression: ");
		String expression = scanner.nextLine();
		System.out.println(calculator.calculate(expression));
		scanner.close();
	}
}
