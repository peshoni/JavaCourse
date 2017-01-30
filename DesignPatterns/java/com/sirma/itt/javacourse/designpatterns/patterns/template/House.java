package com.sirma.itt.javacourse.designpatterns.patterns.template;

/**
 * ITTE - 1918 Template design pattern. Abstract class.
 * 
 * @author Petar Ivanov
 */
public abstract class House {
	/**
	 * A method for performing some work.
	 */
	abstract void buildTheFundaments();

	/**
	 * A method for performing some work.
	 */
	abstract void buildeTheWalls();

	/**
	 * A method for performing some work.
	 */
	abstract void buildTheRoof();

	/**
	 * Arranging the work steps.
	 */
	public final void buildHouse() {
		buildTheFundaments();
		buildeTheWalls();
		buildTheRoof();
	}
}
