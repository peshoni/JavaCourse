package com.sirma.itt.javacourse.reflectionannotationregex.classinfo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test get methods of {@link ClassInfo}
 * 
 * @author Petar Ivanov
 */
public class TestClassInfo {
	final static String NL = System.lineSeparator();

	/**
	 * Test method for
	 * {@link com.sirma.itt.javacourse.reflectionannotationregex.classinfo.ClassInfo#getMethods(java.lang.Object)}.
	 */
	@Test
	public void testGetMethods() {
		SomeClass object = new SomeClass();
		SomeClass secondobject = new SomeClass();
		Assert.assertTrue((ClassInfo.getMethods(object)).equals(ClassInfo.getMethods(secondobject)));
	}

	/**
	 * Test method for
	 * {@link com.sirma.itt.javacourse.reflectionannotationregex.classinfo.ClassInfo#getFields(java.lang.Object)}.
	 */
	@Test
	public void testGetFields() {
		SomeClass object = new SomeClass();
		SomeClass secondobject = new SomeClass();
		Assert.assertTrue((ClassInfo.getFields(object)).equals(ClassInfo.getFields(secondobject)));
	}
}
