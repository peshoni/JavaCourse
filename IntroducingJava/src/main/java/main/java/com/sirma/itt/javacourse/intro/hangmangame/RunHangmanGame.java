package main.java.com.sirma.itt.javacourse.intro.hangmangame;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1563 Hangman game run class.
 * 
 * @author Petar Ivanov
 */
public final class RunHangmanGame {
	private static final Logger LOGGER = LoggerFactory.getLogger(RunHangmanGame.class);
	/**
	 * Array with words for the game.
	 */
	static final String[] words = { "Amsterdam", "Ankara", "Athens", "Baku", "Belfast", "Belgrade", "Berlin", "Bern",
			"Bratislava", "Brussels", "Bucharest", "Budapest", "Cardiff", "Copenhagen", "Dublin", "Edinburgh",
			"Gibraltar", "Helsinki", "Kiev", "Lisbon", "Ljubljana", "London", "Luxembourg", "Madrid", "Minsk", "Monaco",
			"Moscow", "Nicosia", "Oslo", "Paris", "Podgorica", "Prague", "Pristina", "Riga", "Rome", "Sarajevo",
			"Skopje", "Sofia", "Stockholm", "Sukhumi", "Tallinn", "Tbilisi", "Tirana", "Vaduz", "Valletta", "Vienna",
			"Vilnius", "Warsaw", "Zagreb" };

	/**
	 * Private constructor.
	 */
	private RunHangmanGame() {
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 *            For main class.
	 */
	public static void main(String[] args) {
		Scanner consoleInput = new Scanner(System.in, "UTF-8");
		LOGGER.info("Welcome to Hangman game! ");
		LOGGER.info("\n The theme is European capitals." + "\n You have six attempts to guess. Good luck!");
		HangmanGame.playGame(words, consoleInput);
	}
}