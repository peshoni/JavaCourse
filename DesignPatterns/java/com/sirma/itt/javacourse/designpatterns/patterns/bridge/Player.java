package com.sirma.itt.javacourse.designpatterns.patterns.bridge;

/**
 * ITTE-1899 Bridge design pattern. Abstarct class, which decouples the methods
 * from their implementations and lets different implementations be used
 * depending on the constructor.
 * 
 * @author Petar Ivanov
 */
public abstract class Player {
	protected Playing playing;
	protected String name;

	/**
	 * Creates an abstraction that uses a player which implements
	 * {@link Playing} interface.
	 * 
	 * @param name
	 *            Name of the player.
	 * @param player
	 *            {@link Playing} object.
	 */
	protected Player(String name, Playing player) {
		this.name = name;
		this.playing = player;
	}

	/**
	 * Action to be performed.
	 */
	public abstract void playGame();
}
