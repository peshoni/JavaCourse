package com.sirma.itt.javacourse.collections.hashdice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1823 Dice class. Class contains methods for gets combination of two dices, getting and printing statistic of
 * throws.
 * 
 * @author Petar Ivanov
 */
public class Dice {
	private static final Logger LOGGER = LoggerFactory.getLogger(Dice.class);
	private static final int SIDES = 6;
	private int numberOfThrown;
	private HashMap<String, DiceThrow> combination;
	private Random generator;
	private boolean isVisisted;

	/**
	 * Constructor. It creates a {@link HashMap} that will contain combinations and statistics with serial number of
	 * throw for each combination.
	 * 
	 * @param number
	 *            Number of throwing of the dices.
	 */
	public Dice(int number) {
		this.numberOfThrown = number;
		generator = new Random();
		combination = new HashMap<String, DiceThrow>();
	}

	/**
	 * Collects combinations of throws dices. When the dices is thrown, number of throwing notes behind the combination.
	 * This happens 'numberOfTrown' times.
	 * 
	 * @return True if statistics are completed successfully.
	 */
	public boolean rollDices() {
		for (int i = 0; i < numberOfThrown;) {
			String throwDice = throwDice();
			if (!combination.containsKey(throwDice)) {
				combination.put(throwDice, new DiceThrow());
			}
			combination.get(throwDice).addThrowNumber(++i);
			isVisisted = true;
		}
		return isVisisted;
	}

	/**
	 * Throws dices for gets combination.
	 * 
	 * @return String with combination.
	 */
	private String throwDice() {
		int[] array = { 1 + generator.nextInt(SIDES), 1 + generator.nextInt(SIDES) };
		Arrays.sort(array);
		return Arrays.toString(array);
	}

	/**
	 * Print HashMap entry sets.
	 */
	public void printStatistics() {
		combination.forEach((key, value) -> {
			LOGGER.info(String.format("%s %s", key, value.getStatistics()));
		});
	}
}
