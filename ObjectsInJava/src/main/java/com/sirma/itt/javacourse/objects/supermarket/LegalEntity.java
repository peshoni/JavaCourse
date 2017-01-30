package com.sirma.itt.javacourse.objects.supermarket;

/**
 * 
 * @author Petar Ivanov
 */
public abstract class LegalEntity {
	String name;
	String address;
	String manager;

	public LegalEntity(String name) {
		this.name = name;
	}

	public void set(String address, String manager) {
		this.address = address;
		this.manager = manager;
	}

	public String getAddress() {
		return address;
	}

	public String getManager() {
		return manager;
	}

}
