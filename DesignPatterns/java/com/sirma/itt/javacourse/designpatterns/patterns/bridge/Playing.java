package com.sirma.itt.javacourse.designpatterns.patterns.bridge;

/**
 * ITTE-1899 Bridge design pattern.
 * 
 * @author Petar Ivanov
 */
public interface Playing {
	/**
	 * Action to be performed.
	 * 
	 * @param name
	 *            Name of the player.
	 */
	public void play(String name);
}
