package com.sirma.itt.javacourse.reflectionannotationregex.emailvalidator;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * ITTE-1747 Test EmailValidator class.
 * 
 * @author Petar Ivanov
 */
public class TestEmailValidator {
	private static EmailValidator emailValidator;

	@BeforeClass
	public static void initData() {
		emailValidator = new EmailValidator();
	}

	/**
	 * Tests validator method with correct string.
	 */
	@Test
	public final void testCorrectEmail() {
		String stringForValidate = "test@sirma.com";
		Assert.assertTrue(emailValidator.validate(stringForValidate));
	}

	/**
	 * Test with a string containing incorrect email.
	 */
	@Test
	public final void testIncorrectEmail() {
		String stringForValidate = "111111test@sirma.com";
		Assert.assertFalse(emailValidator.validate(stringForValidate));
	}

	/**
	 * Test with a string containing incorrect email.
	 */
	@Test
	public final void testIncorrectEmailTwo() {
		String stringForValidate = "ivo@@@@@alabala.com";
		Assert.assertFalse(emailValidator.validate(stringForValidate));
	}

	/**
	 * Test with a string containing incorrect email.
	 */
	@Test
	public final void testIncorrectEmailThree() {
		String stringForValidate = "eee@cc.british.museum9";
		Assert.assertFalse(emailValidator.validate(stringForValidate));
	}

	/**
	 * Test with a string containing incorrect email.
	 */
	@Test
	public final void testIncorrectEmailFour() {
		String stringForValidate = "11eee@cc.british.museum";
		Assert.assertFalse(emailValidator.validate(stringForValidate));
	}

	/**
	 * Test with a string containing incorrect email.
	 */
	@Test
	public final void testIncorrectEmailFive() {
		String stringForValidate = "a...........@...........aaaaaaaaaaaaaaa";
		Assert.assertFalse(emailValidator.validate(stringForValidate));
	}
}
