package com.sirma.itt.javacourse.objects.supermarket;

/**
 * 
 * @author Petar Ivanov
 */
public abstract class DeliveryContact implements Contract {
	Object provider;
	Object recipient;
	Object product;
	Supermarket supermarketOne = new Supermarket("superOne");
	Provider providerOne = new Provider("ProviderOne");
	Product productOne = new Product();
}
