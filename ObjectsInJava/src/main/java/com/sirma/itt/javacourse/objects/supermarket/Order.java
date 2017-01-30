package com.sirma.itt.javacourse.objects.supermarket;

/**
 * 
 * @author Petar Ivanov
 */
public abstract class Order implements Contract {
	Object customer;
	Boolean paid;

	RandomCustomer randomcustomer = new RandomCustomer("customerOne");
	RegularCustomer regularCustomeRoNE = new RegularCustomer("regularCustormerOne");
	Supermarket supermarketOne = new Supermarket("supermarketOne");
	Product productOne = new Product();

}
