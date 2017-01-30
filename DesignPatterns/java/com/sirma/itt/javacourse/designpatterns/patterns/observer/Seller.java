package com.sirma.itt.javacourse.designpatterns.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * ITTE-1914 Observer design pattern. Seller Class registering sales in all
 * observed it lists.
 * 
 * @author Petar Ivanov
 */
public class Seller {
	private List<Observer> observers = new ArrayList<Observer>();
	private String item;
	private int quantity;

	/**
	 * Attaching subject to the list of observers
	 * 
	 * @param observer
	 *            Updater.
	 */
	public void attachObserver(Observer observer) {
		observers.add(observer);
	}

	/**
	 * Sales and notify observed.
	 * 
	 * @param item
	 *            Item that will sell.
	 * @param quantity
	 *            Quantity of items.
	 */
	public void setSold(String item, Integer quantity) {
		this.item = item;
		this.quantity = quantity;
		notifyObservers();
	}

	/**
	 * Notify observed.
	 */
	private void notifyObservers() {
		observers.forEach(e -> e.update());
	}

	/**
	 * Getter method for article.
	 *
	 * @return the article
	 */
	public String getItem() {
		return item;
	}

	/**
	 * Getter method for quantity.
	 *
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
}
