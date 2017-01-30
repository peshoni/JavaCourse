package com.sirma.itt.javacourse.collections.exceptionmanager;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1825 Class RunExceptionMessageManager.
 * 
 * @author Petar Ivanovs
 */
public class RunExceptionMessageManager {
	private static final Logger LOGGER = LoggerFactory.getLogger(RunExceptionMessageManager.class);

	/**
	 * Private constructor.
	 */
	private RunExceptionMessageManager() {
	}

	/**
	 * Main RunExceptionMessageManager method.
	 * 
	 * @param args
	 *            Arguments for main method.
	 */
	public static void main(String[] args) {
		ExceptionMessageManager manager = new ExceptionMessageManager();
		manager.addExceptionMessage("Invalid UCC.");
		manager.addExceptionMessageUsingCode("Invalid DC number");
		manager.addExceptionMessage("Invalid ZIP code.");
		List<String> managerList = manager.getmessages(manager.getMessage());
		managerList.forEach(e -> LOGGER.info(e));
	}
}
