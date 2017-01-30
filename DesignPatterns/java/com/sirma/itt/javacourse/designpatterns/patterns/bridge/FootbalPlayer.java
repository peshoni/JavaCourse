package com.sirma.itt.javacourse.designpatterns.patterns.bridge;

/**
 * ITTE-1899 Bridge design pattern.
 * 
 * @author Petar Ivanov
 */
public class FootbalPlayer extends Player {

	/**
	 * Of the arguments that will call the constructor depends on what player
	 * will create.
	 * 
	 * @param playing
	 */
	protected FootbalPlayer(String name, Playing playing) {
		super(name, playing);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void playGame() {
		playing.play(name);
	}
}
