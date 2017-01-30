package com.sirma.itt.javacourse.designpatterns.patterns.facade;

/**
 * ITTE-1905 Facade design pattern. Interface for complicated prepairing of
 * food.
 * 
 * @author Petar Ivanov
 */
public interface Cook {
	public void shop();

	public void cleansingProducts();

	public void readRecipy();

	public void cook();
}
