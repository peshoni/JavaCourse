package com.sirma.itt.javacourse.designpatterns.patterns.mail;

import java.util.ArrayList;
import java.util.List;

/**
 * ITTE-1951-Mail. Class that creates mail object with given parameters.
 * 
 * @author Petar Ivanov
 */
public class Mail {
	private String from;
	private String to;
	private String subject;
	private String content;
	private String cc;
	private ArrayList<Object> atachmentsList;

	/**
	 * Constructor.
	 */
	public Mail() {
		atachmentsList = new ArrayList<Object>();
	}

	/**
	 * Getter method for from.
	 *
	 * @return the from
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * Setter method for from.
	 *
	 * @param from
	 *            the from to set
	 */
	public void setFrom(String from) {
		this.from = from;
	}

	/**
	 * Getter method for to.
	 *
	 * @return the to
	 */
	public String getTo() {
		return to;
	}

	/**
	 * Setter method for to.
	 *
	 * @param to
	 *            the to to set
	 */
	public void setTo(String to) {
		this.to = to;
	}

	/**
	 * Getter method for subject.
	 *
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * Setter method for subject.
	 *
	 * @param subject
	 *            the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * Getter method for content.
	 *
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * Setter method for content.
	 *
	 * @param content
	 *            the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * Getter method for cc.
	 *
	 * @return the cc address
	 */
	public String getCc() {
		return cc;
	}

	/**
	 * Setter method for cc.
	 *
	 * @param cc
	 *            the cc to set
	 */
	public void setCc(String cc) {
		this.cc = cc;
	}

	/**
	 * Getter method for attachments.
	 * 
	 * @return List of attachments.
	 */
	public List<Object> getAttachments() {
		return atachmentsList;
	}

	/**
	 * Setter method for attachments.
	 *
	 * @param attachments
	 *            the attachments to set
	 */
	public void setAttachments(Object attachments) {
		this.atachmentsList.add(attachments);
	}
}
