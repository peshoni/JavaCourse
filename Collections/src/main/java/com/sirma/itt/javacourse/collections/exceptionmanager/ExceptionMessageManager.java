package com.sirma.itt.javacourse.collections.exceptionmanager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * ITTE-1825 Class ExceptionMessageManager.
 * 
 * @author Petar Ivanov
 */
public class ExceptionMessageManager {
	private HashMap<String, String> managerExceptions;
	private String message;
	private static final String SEPARATOR = "|";

	/**
	 * Constructor.
	 */
	public ExceptionMessageManager() {
		message = "";
		managerExceptions = new HashMap<String, String>();
		managerExceptions.put(Messages.DC.getKey(), Messages.DC.getValue());
		managerExceptions.put(Messages.UCC.getKey(), Messages.UCC.getValue());
		managerExceptions.put(Messages.ZIP.getKey(), Messages.ZIP.getValue());
	}

	/**
	 * Adds exception message by code.
	 * 
	 * @param messageCode
	 *            Code of the message, which will add.
	 * 
	 * @return True if it is added successfully and false if the code is not listed.
	 */
	public boolean addExceptionMessageUsingCode(String messageCode) {
		if (managerExceptions.containsKey(messageCode)) {
			message = String.format("%s%s%s", message, managerExceptions.get(messageCode), SEPARATOR);
			return true;
		}
		return false;
	}

	/**
	 * Adds exception message by message.
	 * 
	 * @param customMessage
	 *            The message that will be added.
	 * @return True if it is added successfully and false if the message is not listed.
	 */
	public boolean addExceptionMessage(String customMessage) {
		if (managerExceptions.containsValue(customMessage)) {
			message = String.format("%s%s%s", message, customMessage, SEPARATOR);
			return true;
		}
		return false;
	}

	/**
	 * Creates object String with messages.
	 * 
	 * @return Created string with messages or null if message string is empty.
	 */
	public String getMessage() {
		if (!message.isEmpty()) {
			return message.substring(0, message.length() - 1);
		}
		return null;
	}

	/**
	 * Separates string by Separator and adds separated substring to the list. Returns an instance of the Collection.
	 * 
	 * @param messageSet
	 *            String with messages separated by SEPARATOR.
	 * @return Array list containing messages.
	 */
	public List<String> getmessages(String messageSet) {
		return new ArrayList<>(Arrays.asList(messageSet.split(String.format("\\%s", SEPARATOR))));
	}
}
