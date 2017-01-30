package com.sirma.itt.javacourse.reflectionannotationregex.ibanvalidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ITTE-1743 - Class IbanBgValidator contains methods for validating and masking valid BG iban account.
 * 
 * @author Petar Ivanov
 */
public class IbanBgValidator {
	/**
	 * BG iban pattern.
	 */
	private static final String BG_IBAN = "BG\\d{2} [A-Z]{4}(\\ \\d{4}){4}";
	/**
	 * Determine the part of IBAN to hide behind the mask.
	 */
	private static final String HIDE = "BG\\d{2} [A-Z]{4}(\\ \\d{4}){3}";
	/**
	 * Hides the selected characters from valid IBAN.
	 */
	private static final String MASK = "****";
	private Pattern pattern;
	private Matcher matcher;

	/**
	 * Constructs validator with pattern.
	 */
	public IbanBgValidator() {
		pattern = Pattern.compile(BG_IBAN);
	}

	/**
	 * Method which validate string with iban a set template.
	 * 
	 * @param inputString
	 *            with iban
	 * @return true If there is a match with the template.
	 */
	public final boolean isValiBgIban(final String inputString) {
		matcher = pattern.matcher(inputString);
		return matcher.matches();
	}

	/**
	 * Method which replace the part of string with mask.
	 * 
	 * @param inputString
	 *            with iban.
	 * @return Processed inputString.
	 */
	public final String maskBgIban(final String inputString) {
		return inputString.replaceAll(HIDE, MASK);
	}
}
