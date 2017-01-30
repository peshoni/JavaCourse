package com.sirma.itt.javacourse.exceptions.list;

import org.junit.Assert;
import org.junit.Test;

/**
 * ITTE-1730 - Tests List class methods.
 * 
 * @author Petar Ivanov
 */
public class TestList {
	/**
	 * Trying to add an element in the list with zero elements. Test method for
	 * {@link com.sirma.itt.javacourse.exceptions.list.List#addElement(java.lang.Object)}
	 * .
	 */
	@Test(expected = FullListException.class)
	public final void testAddElement() {
		List newList = new List(0);
		newList.addElement("element");
	}

	/**
	 * Trying to remove the element when no such. Test method for
	 * {@link com.sirma.itt.javacourse.exceptions.list.List#removeElement()}.
	 */
	@Test(expected = EmptyListException.class)
	public final void testRemoveElement() {
		List newList = new List(0);
		newList.removeElement();
	}

	/**
	 * Removing element from the one element list. Test method for
	 * {@link com.sirma.itt.javacourse.exceptions.list.List#removeElement()}.
	 */
	@Test
	public final void testRemove() {
		List newList = new List(1);
		newList.addElement("testElement");
		newList.removeElement();
	}

	/**
	 * Tests print method. Test method for
	 * {@link com.sirma.itt.javacourse.exceptions.list.List#printList()}.
	 */
	@Test
	public final void testPrintList() {
		List newList = new List(1);
		final String element = "final";
		newList.addElement(element);
		String expected = "[final]";
		Assert.assertEquals(expected, newList.printList());
	}
}
