package com.sirma.itt.javacourse.collections.pagebean;

/**
 * ITTE-1824 Page class.
 * 
 * @author Petar Ivanov
 */
public class Page {
	private String text;

	/**
	 * 
	 * @param text
	 */
	public Page(String text) {
		this.text = text;
	}

	/**
	 * Getter method for text.
	 *
	 * @return the text
	 */
	public String getText() {
		return text;
	}
}
