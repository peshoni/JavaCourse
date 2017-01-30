package com.sirma.itt.javacourse.collections.exceptionmanager;

/**
 * ITTE-1825. Collection of constant messages.
 * 
 * @author Petar Ivanov
 */
public enum Messages {
	DC("Invalid DC number", "Invalid number of debit card."), UCC("Invalid UCC", "Invalid UCC."), ZIP("Invalid ZIP",
			"Invalid ZIP code.");
	private String key;
	private String value;

	/**
	 * Private constructor.
	 * 
	 * @param key
	 *            Key
	 * @param value
	 *            Value
	 */
	private Messages(String key, String value) {
		this.key = key;
		this.value = value;
	}

	/**
	 * Getter method for key.
	 *
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * Getter method for value.
	 *
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
}
