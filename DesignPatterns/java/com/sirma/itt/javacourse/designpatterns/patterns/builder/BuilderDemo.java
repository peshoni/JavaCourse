package com.sirma.itt.javacourse.designpatterns.patterns.builder;

/**
 * ITTE-1900 Builder design pattern.
 * 
 * @author Petar Ivanov
 */
public class BuilderDemo {

	/**
	 * Demonstates Builder design pattern.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SuitBuilder builder = new SuitBuilder();
		Suit winterSuit = builder.makeSummerSuit();
		winterSuit.showPartsProperties();
		String price = String.format("%.5g%n", winterSuit.getTotalPrice());
		System.out.println("Total price: " + price);
		Suit summerSuit = builder.makeWinterSuit();
		System.out.println();
		price = String.format("%.5g%n", summerSuit.getTotalPrice());
		summerSuit.showPartsProperties();
		System.out.println("Total price: " + price);
	}
}
