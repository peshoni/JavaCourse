package com.sirma.itt.javacourse.objects.supermarket;

/**
 * 
 * @author Petar Ivanov
 */
public abstract class EmployementContract implements Contract {
	Supermarket supermarketOne = new Supermarket("superOne");
	Seller sellerOne = new Seller("Ivan Ivanov");
	Manager manager = new Manager("Nikola nikolov");
	Staff personOne = new Staff("Maria Kacarova");
}
