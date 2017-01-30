package com.sirma.itt.javacourse.designpatterns.patterns.builder;

/**
 * ITTE-1900 Builder design pattern. Build set of objects.
 * 
 * @author Petar Ivanov
 */
public class SuitBuilder {
	/**
	 * Build summer suit with {@link LowerPart} and {@link UpperPart}.
	 * 
	 * @return {@link Suit}
	 */
	public Suit makeSummerSuit() {
		Suit suit = new Suit();
		suit.addSuitComponent(new Skirt());
		suit.addSuitComponent(new Shirt());
		return suit;
	}

	/**
	 * Build summer suit with {@link LowerPart} and {@link UpperPart}.
	 * 
	 * @return Suit {@link Suit}
	 */
	public Suit makeWinterSuit() {
		Suit suit = new Suit();
		suit.addSuitComponent(new Jacket());
		suit.addSuitComponent(new Pants());
		return suit;
	}
}
