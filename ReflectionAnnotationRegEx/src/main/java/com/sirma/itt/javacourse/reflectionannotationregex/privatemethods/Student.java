package com.sirma.itt.javacourse.reflectionannotationregex.privatemethods;

/**
 * ITTE-1774 Class with private methods and fields.
 * 
 * @author Petar Ivanov
 */
public class Student {
	@SuppressWarnings("unused")
	private boolean isDrinking;
	@SuppressWarnings("unused")
	private boolean isSmoking;

	/**
	 * Constructor
	 * 
	 * @param drink
	 *            Boolean to set.
	 * @param smoke
	 *            Boolean to set.
	 */
	public Student(boolean drink, boolean smoke) {
		this.isDrinking = drink;
		this.isSmoking = smoke;
		holdsMoney();
		worksTooMuch();
	}

	/**
	 * Private exemplary method.
	 * 
	 * @return Integer
	 */
	private int holdsMoney() {
		return 500;
	}

	/**
	 * Private exemplary method.
	 * 
	 * @return Boolean
	 */
	private boolean worksTooMuch() {
		return true;
	}
}
