package com.sirma.itt.javacourse.designpatterns.patterns.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * ITTE-1900 Builder design pattern. Adds the componnets to the suit, calculates
 * total cost and shows parts properties.
 * 
 * @author Petar Ivanov
 */
public class Suit {
	private List<Components> components = new ArrayList<Components>();

	/**
	 * Adds parts of suit.
	 * 
	 * @param component
	 *            {@link Components}}
	 */
	public void addSuitComponent(Components component) {
		components.add(component);
	}

	/**
	 * Calculates total cost per suit.
	 * 
	 * @return Sum of the components price.
	 */
	public float getTotalPrice() {
		float total = 0;
		for (Components components2 : components) {
			total += components2.price();
		}
		return total;
	}

	/**
	 * Shows properties for given component.
	 */
	public void showPartsProperties() {
		for (Components components2 : components) {
			System.out.println("article: " + components2.name());
			System.out.println(" colour: " + components2.colour());
			System.out.println("brigade: " + components2.sew().getClass().getSimpleName());
			System.out.println("  price: " + components2.price());
		}
	}
}
