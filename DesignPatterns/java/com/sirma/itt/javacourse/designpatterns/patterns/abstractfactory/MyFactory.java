package com.sirma.itt.javacourse.designpatterns.patterns.abstractfactory;

/**
 * ITTE-1897 Abstract factory. Instantiates an object by Reflection.
 * 
 * @author Petar Ivanov
 */
public class MyFactory {
	/**
	 * Private constructor for utility classes.
	 */
	private MyFactory() {
	}

	/**
	 * Create instance by reflection.
	 * 
	 * @param className
	 *            The name of the object that will be created
	 * @return Null if InstantiationException or IllegalAccessException occurs.
	 * @throws ClassNotFoundException
	 *             when exception occurs.
	 */
	public static Object createInstance(String className) throws ClassNotFoundException {
		Object instance = null;
		Class<?> clas = Class.forName(className);
		try {
			instance = clas.newInstance();
		} catch (InstantiationException e) {
			return null;
		} catch (IllegalAccessException e) {
			return null;
		}
		return instance;
	}
}
