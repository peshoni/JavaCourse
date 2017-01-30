package com.sirma.itt.javacourse.reflectionannotationregex.privatemethods;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Assert;
import org.junit.Test;

/**
 * ITTE-1774 - TestAccessPrivateData class.
 * 
 * @author Petar Ivanov
 */
public class TestAccessPrivateData {
	private Student someStudent = new Student(true, true);

	/**
	 * Test getMethod of the AccessPrivateData class.
	 * 
	 * @throws InvocationTargetException
	 *             When an exception occurs.
	 * @throws IllegalArgumentException
	 *             When an exception occurs.
	 * @throws IllegalAccessException
	 *             When an exception occurs.
	 */
	@Test
	public void testGetMethods() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method[] declaredMethods = someStudent.getClass().getDeclaredMethods();
		Method[] takenMethods = AccessPrivateData.getPrivateMethod(someStudent);
		Assert.assertArrayEquals(declaredMethods, takenMethods);
	}

	/**
	 * Test getFields of the AccessPrivateData class.
	 * 
	 * @throws IllegalAccessException
	 *             When an exception occurs.
	 * @throws IllegalArgumentException
	 *             When an exception occurs.
	 */
	@Test
	public void testGetFields() throws IllegalArgumentException, IllegalAccessException {
		Field[] declaredFields = someStudent.getClass().getDeclaredFields();
		Field[] takenFields = AccessPrivateData.getField(someStudent);
		Assert.assertArrayEquals(takenFields, declaredFields);
	}
}
