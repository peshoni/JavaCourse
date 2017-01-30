package test.java.com.sirma.itt.javacourse.intro.hangmangame;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

import main.java.com.sirma.itt.javacourse.intro.hangmangame.HangmanGame;

/**
 * ITTE-1563 Test HangmanGame class.
 * 
 * @author Petar Ivanov
 */
public class TestHangman {
	/**
	 * Test with letters not all present in the word.
	 */
	@Test
	public final void testLose() {
		String[] words = { "Berlin" };
		String guessesOne = ("l i n g g f f f f f n");
		Scanner consoleInput = new Scanner(guessesOne);
		Assert.assertFalse(HangmanGame.playGame(words, consoleInput));
	}

	/**
	 * Test with all the letters of the word.
	 */
	@Test
	public final void testWin() {
		String[] words = { "Berlin" };
		String guessesTwo = ("l i n g g j b e r n n");
		Scanner consoleInputTwo = new Scanner(guessesTwo);
		Assert.assertTrue(HangmanGame.playGame(words, consoleInputTwo));
		consoleInputTwo.close();
	}
}
