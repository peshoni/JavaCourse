package com.sirma.itt.javacourse.designpatterns.patterns.iterator;

/**
 * ITTE-1909 Iterator design pattern.
 * 
 * @author Petar Ivanov
 */
public class IteratorDemo {
	private static final String[] color = { "red", "green", "blue", "gray", "purple" };

	/**
	 * Use the {@link Objects} to get iterator and print names.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Iterator iterator = new Objects(color).getIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
