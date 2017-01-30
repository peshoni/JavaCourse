package com.sirma.itt.javacourse.designpatterns.patterns.prototype;

/**
 * ITTE-1912 Prototype design pattern. Cloneable Prototype abstract class.
 * 
 * @author Petar Ivanov
 */
public abstract class Prototype implements Cloneable {
	private String coupe;
	protected String engine;
	protected String colour;

	abstract void test();

	/**
	 * {@inheritDoc}
	 */
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}

	/**
	 * Getter method for engine.
	 *
	 * @return the engine
	 */
	public String getEngine() {
		return engine;
	}

	/**
	 * Setter method for engine.
	 *
	 * @param engine
	 *            the engine to set
	 */
	public void setEngine(String engine) {
		this.engine = engine;
	}

	/**
	 * Getter method for colour.
	 *
	 * @return the colour
	 */
	public String getColour() {
		return colour;
	}

	/**
	 * Setter method for colour.
	 *
	 * @param colour
	 *            the colour to set
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}

	/**
	 * Getter method for coupe.
	 *
	 * @return the coupe
	 */
	public String getCoupe() {
		return coupe;
	}

	/**
	 * Setter method for coupe.
	 *
	 * @param coupe
	 *            the coupe to set
	 */
	public void setCoupe(String coupe) {
		this.coupe = coupe;
	}
}
