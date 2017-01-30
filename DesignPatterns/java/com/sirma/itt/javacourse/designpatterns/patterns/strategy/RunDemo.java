package com.sirma.itt.javacourse.designpatterns.patterns.strategy;

/**
 * ITTE-1917 Strategy design pattern.
 * 
 * @author Petar Ivanov
 */
public class RunDemo {

	/**
	 * Demostrates hurdles and strategy that will allow us to not fall.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Context context = new Context(new Run());
		context.go();
		int[] trip = { 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0 };
		for (int i = 0; i < trip.length; i++) {
			switch (trip[i]) {
			case 0:
				context = new Context(new Run());
				break;
			case 1:
				context = new Context(new Jump());
				break;
			default:
				break;
			}
			context.go();
		}
	}
}
