package com.sirma.itt.javacourse.designpatterns.patterns.observer;

import java.util.Hashtable;

/**
 * ITTE-1914 Observer design pattern. Available class monitors available items
 * and quantity.
 * 
 * @author Petar Ivanov
 * 
 */
public class Available extends Observer {
	private Hashtable<String, Integer> table;

	/**
	 * Constructs HashTable and attach to the Observers list.
	 * 
	 * @param seller
	 */
	public Available(Seller seller) {
		table = new Hashtable<String, Integer>();
		this.seller = seller;
		this.seller.attachObserver(this);
	}

	/**
	 * Add item
	 * 
	 * @param item
	 *            Item which will add.
	 * @param quantity
	 *            Quantity of items.
	 */
	public void addProduct(String item, Integer quantity) {
		table.put(item, quantity);
	}

	/**
	 * Print entryset of the Hashtable.
	 */
	public void printAvailable() {
		System.out.println("  Available:");
		table.entrySet().forEach(element -> System.out.println(element.toString()));
	}

	/**
	 * Updated after being notified by Seller. {@inheritDoc}
	 */
	@Override
	public void update() {
		sellProduct(seller.getItem(), seller.getQuantity());
	}

	/**
	 * Reducing the amount of after-sales.
	 * 
	 * @param item
	 *            Item that will sell.
	 * @param quantity
	 *            Quantity of items.
	 */
	private void sellProduct(String item, Integer quantity) {
		table.computeIfPresent(item, (String, Integer) -> (Integer -= quantity));
	}
}
