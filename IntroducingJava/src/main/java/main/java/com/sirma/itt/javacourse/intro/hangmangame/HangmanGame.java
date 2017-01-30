package main.java.com.sirma.itt.javacourse.intro.hangmangame;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import main.java.com.sirma.itt.javacourse.intro.randomstring.RandomString;

/**
 * ITTE-1563 Hangman game class. Contains Methods for: generating random words from array, making guesses and Print
 * Hangman.
 * 
 * @author Petar Ivanov
 */
public final class HangmanGame {
	private static final Logger LOGGER = LoggerFactory.getLogger(HangmanGame.class);

	/**
	 * Private constructor.
	 */
	private HangmanGame() {
	}

	/**
	 * PlayGame method which supplies the parameters for making a guess.
	 * 
	 * @param words
	 *            Input array for choosing word
	 * @param consoleInput
	 *            Input chars from keyboard
	 * @return Returns true to recognized and false for unrecognized word
	 */
	public static boolean playGame(final String[] words, final Scanner consoleInput) {
		int countBadGuesess = 0;
		String word = generatesWord(words).toLowerCase();
		String usedLetter = "";

		StringBuilder builder = new StringBuilder();
		for (int i = 1; i <= word.length(); i++) {
			builder.append("" + "-");
		}

		char[] guessToChar = builder.toString().toCharArray();
		char[] wordToChar = word.toCharArray();

		LOGGER.info(printHangman(0));
		LOGGER.info(String.copyValueOf(guessToChar));
		return makeGuess(countBadGuesess, usedLetter, word, guessToChar, wordToChar, consoleInput);
	}

	/**
	 * Method for Word recognition.
	 * 
	 * @param countBadGuesess
	 *            counter for bad guesses
	 * @param usedLetter
	 *            String with used letter
	 * @param word
	 *            The word to guess
	 * @param guessToChar
	 *            Array with chars which contains "-" word.length times
	 * @param wordToChar
	 *            Array with chars which contains in word
	 * @param consoleInput
	 *            Input from keyboard
	 * @return Returns true to recognized and false for unrecognized word
	 */
	private static boolean makeGuess(int countBadGuesess, String usedLetter, String word, char[] guessToChar,
			char[] wordToChar, Scanner consoleInput) {
		final int attempts = 6;
		if (String.copyValueOf(guessToChar).equals(String.copyValueOf(wordToChar))) {
			LOGGER.info("You Won!");
			playAgain(consoleInput);
			return true;
		} else {
			if (countBadGuesess == attempts) {
				LOGGER.info("You Lost! The word was: " + word);
				playAgain(consoleInput);
				return false;
			} else {
				String letter = consoleInput.next().toLowerCase();
				if (word.contains(letter)) {
					if (usedLetter.contains(letter)) {
						countBadGuesess += 1;
						LOGGER.info("Wrong! You already use this letter. Remaining " + (attempts - countBadGuesess)
								+ " attempts.");
					} else {
						guessToChar = addLetter(letter, word, guessToChar, wordToChar);
					}
				} else {
					countBadGuesess += 1;
					LOGGER.info("Wrong! Remaining " + (attempts - countBadGuesess) + " attempts.");
					usedLetter += letter;
				}
				LOGGER.info(printHangman(countBadGuesess));
				LOGGER.info(String.copyValueOf(guessToChar));
				usedLetter += letter;
				return makeGuess(countBadGuesess, usedLetter, word, guessToChar, wordToChar, consoleInput);
			}
		}
	}

	/**
	 * Adds detected letter of the word.
	 * 
	 * @param letter
	 *            Letter which was inserted by the user
	 * @param word
	 *            The word to guess
	 * @param guessToChar
	 *            Array with chars which contains "-" word.length times
	 * @param wordToChar
	 *            Array with chars which contains in word
	 * @return Array with characters "-" and the recognized letter.
	 */
	private static char[] addLetter(String letter, String word, char[] guessToChar, char[] wordToChar) {
		for (int i = 0; i < word.length(); i++) {
			if (wordToChar[i] == letter.charAt(0)) {
				guessToChar[i] = letter.charAt(0);
			}
		}
		return guessToChar;
	}

	/**
	 * Method that asks the user it will continue to play.
	 * 
	 * @param consoleInput
	 *            Input chars from keyboard
	 */
	public static void playAgain(final Scanner consoleInput) {
		LOGGER.info("  Play Again?(Y/N): ");
		String userAnswer = consoleInput.next();
		if (userAnswer.contains("y") || userAnswer.contains("Y")) {
			HangmanGame.playGame(RunHangmanGame.words, consoleInput);
		} else {
			LOGGER.info("Good bye!");
		}
	}

	/**
	 * Method for generating random word from array.
	 * 
	 * @param array
	 *            For processing
	 * @return Generated random word from array with words.
	 */
	public static String generatesWord(final String[] array) {
		return array[RandomString.generatesRandomNumber(array.length)];
	}

	/**
	 * Method that returns element of array.
	 * 
	 * @param cuntBadGuesses
	 *            Number of wrong guesses
	 * @return String for printing hang man.
	 */
	public static String printHangman(final int cuntBadGuesses) {
		final String[] man = { "\n___\n   |\n   |\n   |\n", "\n___\n o |\n   |\n   |\n", "\n__\n o |\n/  |\n   |\n",
				"\n___\n o |\n/| |\n   |\n", "\n___\n o |\n/|\\|\n   |\n", "\n___\n o |\n/|\\|\n/  |\n",
				"\n___\n o |\n/|\\|\n/ \\|\n" };
		return man[cuntBadGuesses];
	}
}
