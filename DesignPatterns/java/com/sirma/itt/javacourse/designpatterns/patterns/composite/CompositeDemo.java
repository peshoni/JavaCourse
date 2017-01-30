package com.sirma.itt.javacourse.designpatterns.patterns.composite;

/**
 * ITTE-1903 Composite design pattern.
 * 
 * @author Petar Ivanov
 */
public class CompositeDemo {

	/**
	 * Building structure of Military objects. Accessing their information
	 * independantly or a set of objects.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Military general = new Military("General", "Georgi Vazov");
		Military firstMajor = new Military("Major", "Iliq Strahilov");
		Military secondMajor = new Military("Major", "Hristo Galabov");
		Military firstPrivate = new Military("Private", "Venelin Zagorov");
		Military secondPrivate = new Military("Private", "Nikola Nikolov");
		Military thirdPrivate = new Military("Private", "Ivan Mitrev");
		Military fourthPrivate = new Military("Private", "Hristo Jongozov");

		general.add(firstMajor);
		general.add(secondMajor);
		firstMajor.add(firstPrivate);
		firstMajor.add(secondPrivate);
		secondMajor.add(thirdPrivate);
		secondMajor.add(fourthPrivate);

		System.out.println(general.printTree(general));
		System.out.println(general.getSubordinates().get(1).getSubordinates().get(1).toString());
	}
}
