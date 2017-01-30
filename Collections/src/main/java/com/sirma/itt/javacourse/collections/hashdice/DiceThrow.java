package com.sirma.itt.javacourse.collections.hashdice;

import java.util.ArrayList;

/**
 * ITTE-1823 DiceThrow class.
 * 
 * @author Petar Ivanov
 */
public class DiceThrow {
	private ArrayList<Integer> statistics;

	/**
	 * Constructs object with list of throwing.
	 */
	public DiceThrow() {
		statistics = new ArrayList<Integer>();
	}

	/**
	 * Adds number of throwing for this object.
	 * 
	 * @param number
	 *            To set.
	 */
	public void addThrowNumber(int number) {
		statistics.add(number);
	}

	/**
	 * Getter method for statistics.
	 *
	 * @return the statistics
	 */
	public ArrayList<Integer> getStatistics() {
		return statistics;
	}
}
