package com.sirma.itt.javacourse.designpatterns.patterns.abstractfactory;

/**
 * ITTE-1897 Abstract factory.
 * 
 * @author Petar Ivanov
 */
public class MyFactoryDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Object createdObject = null;
		try {
			createdObject = MyFactory.createInstance("java.lang.String");
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found.");
		}
		System.out.println(String.format("Created object of \"%s\".", createdObject.getClass()));
	}
}
