package com.sirma.itt.javacourse.designpatterns.patterns.mail;

/**
 * ITTE-1951-Mail. Build mail object using Fluent intarface.
 * 
 * @author Petar Ivanov
 */
public class BuildMail {
	private Mail mail;

	/**
	 * Constructs mail object.
	 */
	public BuildMail() {
		mail = new Mail();
	}

	/**
	 * Setter method for name of the sender.
	 * 
	 * @param name
	 *            To set.
	 * @return Mail object sender field.
	 */
	public BuildMail from(String name) {
		mail.setFrom(name);
		return this;
	}

	/**
	 * Setter method for name of the receiver.
	 * 
	 * @param name
	 *            To set.
	 * @return Mail object receiver field.
	 */
	public BuildMail to(String name) {
		mail.setTo(name);
		return this;
	}

	/**
	 * Setter method for subject of mail.
	 * 
	 * @param subject
	 *            To set.
	 * @return Mail object receiver field.
	 */
	public BuildMail subject(String subject) {
		mail.setSubject(subject);
		return this;
	}

	/**
	 * Setter method for the letter.
	 * 
	 * @param content
	 *            To set.
	 * @return Mail object text field.
	 */
	public BuildMail content(String content) {
		mail.setContent(content);
		return this;
	}

	/**
	 * Setter method for carbon copy email.
	 * 
	 * @param email
	 *            To set.
	 * @return Mail object cc address field.
	 */
	public BuildMail carbonCopy(String email) {
		mail.setCc(email);
		return this;
	}

	/**
	 * Setter method for attachments.
	 * 
	 * @param object
	 *            To set.
	 * @return Mail object objects of attachments field.
	 */
	public BuildMail attachments(Object object) {
		mail.setAttachments(object);
		return this;
	}

	/**
	 * Mail builder.
	 * 
	 * @return Created mail object.
	 */
	public Mail build() {
		return mail;
	}
}
