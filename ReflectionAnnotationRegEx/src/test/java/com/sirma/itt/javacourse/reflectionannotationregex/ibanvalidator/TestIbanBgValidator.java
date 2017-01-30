package com.sirma.itt.javacourse.reflectionannotationregex.ibanvalidator;

import org.junit.Assert;
import org.junit.Test;

/**
 * ITTE-1743 -Test the IbanBgValidator class .
 * 
 * @author Petar Ivanov
 */
public class TestIbanBgValidator {
	/**
	 * Test isValidIban method with valid BG IBAN.
	 */
	@Test
	public final void testsValidIban() {
		IbanBgValidator validator = new IbanBgValidator();
		String validIban = "BG80 BNBG 9661 1020 3456 7843";
		Assert.assertTrue(validator.isValiBgIban(validIban));
	}

	/**
	 * Test isValidIban method with invalid IBAN.
	 */
	@Test
	public final void testWithNonValidIban() {
		IbanBgValidator validator = new IbanBgValidator();
		String validIban = "GB35 MIBG 4025 3432 1446 70";
		Assert.assertFalse(validator.isValiBgIban(validIban));
	}

	/**
	 * Test maskBgIban method with valid BG IBAN.
	 */
	@Test
	public final void maskkIban() {
		IbanBgValidator validator = new IbanBgValidator();
		String validIban = "BG80 BNBG 9661 1020 3456 7843";
		String expected = "**** 7843";
		Assert.assertEquals(expected, validator.maskBgIban(validIban));
	}

}
