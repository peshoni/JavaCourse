package com.sirma.itt.javacourse.designpatterns.patterns.interpreter;

/**
 * ITTE-1908 Interpreter design pattern.
 * 
 * @author Petar Ivanov
 */
public class InterpreterContext {
	private String fruits = "apple peach pear";
	private String vegetables = "onion tomato pumpkin";

	/**
	 * Check for presence in the list of fruits.
	 * 
	 * @param word
	 *            The word that will seek.
	 * @return true,if available in the list.
	 */
	public boolean isFruit(String word) {
		return fruits.contains(word.toLowerCase());
	}

	/**
	 * Check for presence in the list of vegetables.
	 * 
	 * @param word
	 *            The word that will seek.
	 * @return true,if available in the list.
	 */
	public boolean isVegetable(String word) {
		return vegetables.contains(word.toLowerCase());
	}
}
