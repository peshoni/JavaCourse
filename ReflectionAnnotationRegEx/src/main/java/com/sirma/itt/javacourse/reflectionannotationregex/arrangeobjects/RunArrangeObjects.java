package com.sirma.itt.javacourse.reflectionannotationregex.arrangeobjects;

/**
 * ITTE-1751 Arranging objects. Run class.
 * 
 * @author Petar Ivanov
 */
public final class RunArrangeObjects {
	/**
	 * Private constructor for utility class.
	 */
	private RunArrangeObjects() {
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 *            Args of main method.
	 */
	public static void main(final String[] args) {
		Parent[] array = { new SecondInheritor(), new FourthInheritor(), new Parent(), new ThirdInheritor(),
				new FirstInheritor() };
		CustomArrangeObjects.print(array);
		CustomArrangeObjects.sortArray(array);
		CustomArrangeObjects.print(array);
	}
}