package com.sirma.itt.javacourse.designpatterns.patterns.bridge;

/**
 * ITTE-1899 Bridge design pattern.
 * 
 * @author Petar Ivanov
 */
public class BridgeDemo {

	/**
	 * Demonstrates bridge design pattern.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Player forward = new FootbalPlayer("Hristo Stoichkov", new Forward());
		forward.playGame();
		Player defender = new FootbalPlayer("Trifon Ivanov", new Defender());
		defender.playGame();
	}
}
