package com.sirma.itt.javacourse.reflectionannotationregex.greedyregex;

/**
 * 
 * ITTE-1742 - Class to replace part of the text template with another text
 * template.
 * 
 * @author Petar Ivanov
 */
public final class TextReplace {

	/**
	 * Private constructor for utility class.
	 */
	private TextReplace() {
	}

	/**
	 * Method for replacing text that starting with <"x"> and ends with
	 * <"/x"> with <"x/">.
	 * 
	 * @param text
	 *            String for processing.
	 * @return Processed string.
	 */
	public static String replaseText(final String text) {
		return text.replaceAll("<x>[^<]*[^x]*[^>]*</x>", "<x/>");
	}
}
