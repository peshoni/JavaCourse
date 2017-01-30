package com.sirma.itt.javacourse.designpatterns.patterns.decorator;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * ITTE-1904 Decorator design pattern.
 * 
 * @author Petar Ivanov
 */
public class DecoratorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Method[] methods;
		Calculate calculator = new Calculator();
		System.out.println("Before:");
		methods = calculator.getClass().getDeclaredMethods();
		Arrays.asList(methods).forEach(e -> System.out.println(e));
		System.out.println("\nAfter decoration:");
		SuperCalculator megaCalculator = new SuperCalculator(calculator);
		methods = megaCalculator.getClass().getDeclaredMethods();
		Arrays.asList(methods).forEach(e -> System.out.println(e));
	}
}
