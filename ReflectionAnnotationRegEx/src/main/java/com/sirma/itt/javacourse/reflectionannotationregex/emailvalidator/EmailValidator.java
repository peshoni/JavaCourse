/**
 * 
 */
package com.sirma.itt.javacourse.reflectionannotationregex.emailvalidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ITTE-1747 - EmailValidator class which validating email to start with a Latin letter followed by Latin letters,
 * digits, '.' or '-'. Then follows '@' and again Latin letter followed by Latin letters, digits, '.' or '-'.
 * 
 * @author Petar Ivanov
 *
 */
public class EmailValidator {
	/**
	 * Email pattern.
	 */
	private static final String PATTERN = "[a-zA-Z]([\\w][\\.]?|[\\-]?)*[@][a-zA-Z]([\\w][\\.]?|[\\-]?)*\\.[a-zA-Z]{2,}";
	private Pattern pattern;
	private Matcher matcher;

	/**
	 * constructor compiler template
	 */
	public EmailValidator() {
		pattern = Pattern.compile(PATTERN);
	}

	/**
	 * Method which validate string with email. A matcher is created from a pattern by invoking the pattern's matcher
	 * method. The matches method attempts to match the entire input sequence against the pattern.
	 * 
	 * @param string
	 *            Input string for validation.
	 * @return true If there is a match with the template.
	 */
	public boolean validate(final String string) {
		matcher = pattern.matcher(string);
		return matcher.matches();
	}
}
