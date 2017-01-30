package com.sirma.itt.javacourse.designpatterns.patterns.facade;

/**
 * ITTE-1905 Facade design pattern. Class which by their methods decouples
 * complecated work from user.
 * 
 * @author Petar Ivanov
 */
public class Restourant {
	private Soup soup;
	private Appetizer appetizer;
	private Dessert dessert;

	/**
	 * Constructor.
	 */
	public Restourant() {
		soup = new Soup();
		appetizer = new Appetizer();
		dessert = new Dessert();
	}

	/**
	 * Method that calls necessary operations for preparation of food.
	 */
	public void orderingAppetizer() {
		appetizer.shop();
		appetizer.cleansingProducts();
		appetizer.readRecipy();
		appetizer.cook();
	}

	/**
	 * Method that calls necessary operations for preparation of food.
	 */
	public void orderingSoup() {
		soup.shop();
		soup.cleansingProducts();
		soup.readRecipy();
		soup.cook();
	}

	/**
	 * Method that calls necessary operations for preparation of food.
	 */
	public void orderingDessert() {
		dessert.shop();
		dessert.cleansingProducts();
		dessert.readRecipy();
		dessert.cook();
	}

	/**
	 * A method that demonstrates a well-mannered waiter.
	 */
	public void pay() {
		System.out.println("I hope to see you soon!");
	}
}
