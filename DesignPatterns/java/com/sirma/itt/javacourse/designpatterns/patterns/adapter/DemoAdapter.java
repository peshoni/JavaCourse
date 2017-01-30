package com.sirma.itt.javacourse.designpatterns.patterns.adapter;

/**
 * Adapter design pattern.
 * 
 * @author Petar Ivanov
 */
public class DemoAdapter {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Power power = new Power();
		if (args.length > -1) {
			for (int i = 0; i < args.length; i++) {
				power.suply(Integer.parseInt(args[i]));
			}
		}
	}
}
