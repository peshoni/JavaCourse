package com.sirma.itt.javacourse.reflectionannotationregex.arrangeobjects;

import org.junit.Assert;
import org.junit.Test;

/**
 * ITTE-1751 Arranging objects.
 * 
 * @author Petar Ivanov
 */
public class TestArrangeObjects {
	/**
	 * Tests sort method.
	 */
	@Test
	public final void testSort() {
		Parent[] array = { new SecondInheritor(), new FourthInheritor(), new Parent(), new ThirdInheritor(),
				new FirstInheritor() };
		Parent[] expected = { array[2], array[4], array[0], array[3], array[1] };
		Parent[] result = CustomArrangeObjects.sortArray(array);
		Assert.assertArrayEquals(expected, result);
	}
}
