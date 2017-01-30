package com.sirma.itt.javacourse.designpatterns.patterns.template;

/**
 * ITTE - 1918 Template design pattern.
 * 
 * @author Petar Ivanov
 */
public class TemplateDemo {

	/**
	 * The object performs its methods in the given order.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		House villa = new Villa();
		villa.buildHouse();
	}
}
