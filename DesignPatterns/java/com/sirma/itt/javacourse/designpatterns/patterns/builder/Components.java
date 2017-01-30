package com.sirma.itt.javacourse.designpatterns.patterns.builder;

/**
 * ITTE-1900 Builder design pattern. Interface for compennents properties -
 * article, producer, colour and price.
 * 
 * @author Petar Ivanov
 */
public interface Components {
	/**
	 * 
	 * @return article
	 */
	public String name();

	/**
	 * 
	 * @return producer
	 */
	public Sew sew();

	/**
	 * 
	 * @return coclor of the component
	 */
	public String colour();

	/**
	 * 
	 * @return price
	 */
	public float price();
}
