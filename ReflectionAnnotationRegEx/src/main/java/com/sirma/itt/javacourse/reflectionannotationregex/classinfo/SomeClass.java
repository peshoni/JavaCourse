package com.sirma.itt.javacourse.reflectionannotationregex.classinfo;

/**
 * ITTE-1748 Class info. Class that contains methods and fields with different access modifiers.
 * 
 * @author Petar Ivanov
 */

public class SomeClass {
	private String name;
	boolean isMale;
	protected int height;
	/**
	 * Public field.
	 */
	public int weight;

	/**
	 * Constructor.
	 */
	public SomeClass() {
		setName("Petar");
		isMale = true;
		height = 179;
		weight = 79;
		privateMethod(weight);
	}

	/**
	 * A method with private access.
	 * 
	 * @param number
	 *            Parameter.
	 */
	private void privateMethod(int number) {
		// for test purposes.
	}

	/**
	 * A method with default access.
	 * 
	 * @param otherNumber
	 *            Parameter.
	 */
	final void defaultMethod(float otherNumber) {
		this.height = (int) otherNumber;
		// for test purposes.
	}

	/**
	 * A method with protected access.
	 * 
	 * @param is
	 *            Boolean parameter.
	 * 
	 */
	protected final void protectedMethod(boolean is) {
		// for test purposes.
	}

	/**
	 * A method with public access.
	 * 
	 * @param string
	 *            Some string.
	 * @param integer
	 *            Some integer.
	 * @return String with result.
	 * 
	 */
	public final String publicMethod(String string, int integer) {
		return string;
	}

	/**
	 * Getter method for name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter method for name.
	 *
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
