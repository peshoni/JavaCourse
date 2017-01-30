package com.sirma.itt.javacourse.reflectionannotationregex.instancebyname;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * ITTE-1773 Test NewInstanceByName class.
 * 
 * @author Petar Ivanov
 */
public class TestNewInstanceByName {
	/**
	 * Test with an existing class.
	 * 
	 * @throws ClassNotFoundException
	 */
	@Test
	public final void testWithCorrectNameOfClass() throws ClassNotFoundException {
		String string = "java.lang.Object";
		Object newInstance = null;
		newInstance = NewInstanceByName.newInstance(string);
		assertEquals(string, newInstance.getClass().getName());
	}

	/**
	 * Test with an nonexisting class.
	 * 
	 * @throws ClassNotFoundException
	 */
	@Test(expected = ClassNotFoundException.class)
	public final void testWithIncorrectNameOfClass() throws ClassNotFoundException {
		String string = "java.nonexistentClass";
		NewInstanceByName.newInstance(string);
	}
}
