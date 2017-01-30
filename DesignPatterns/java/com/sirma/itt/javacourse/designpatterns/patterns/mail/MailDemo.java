package com.sirma.itt.javacourse.designpatterns.patterns.mail;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1951-Mail. Demonstrates building mail object using Fluent interface.
 * 
 * @author Petar Ivanov
 */
public class MailDemo {
	private static final Logger LOGGER = LoggerFactory.getLogger(MailDemo.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Mail mail;
		BuildMail mailObject = new BuildMail();
		File file = new File("file.txt");
		Object object = new Object();
		mail = mailObject.from("Petar").to("Nikolai").subject("Javacourse").content("Hello!").carbonCopy("abv@abv.bg")
				.attachments(file).attachments(object).build();

		LOGGER.info(String.format("From: %s\nto: %s\nsubject: %s\ncontent: %s\ncc: %s\nattachments: %s", mail.getFrom(),
				mail.getTo(), mail.getSubject(), mail.getContent(), mail.getCc(), mail.getAttachments().toString()));
	}
}
