package com.sirma.itt.javacourse.inputoutput.serialization;

import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;

/**
 * ITTE-1812 - Test DataClass class.
 * 
 * @author Petar Ivanov
 */
public class TestDataClass {
	/**
	 * Comparing saved in a text file object and read in a new instance of the
	 * class.
	 * 
	 * @throws IOException
	 */
	@Test
	public void test() throws IOException {
		String path = "testSerializedObject.txt";
		UserDefinedObject object = new UserDefinedObject("Nikolai", 30, 190);	
		DataClass.saveObject(path, object);
		UserDefinedObject readObject =  DataClass.getObject(path);	
		Assert.assertEquals(object.getAge(),readObject.getAge());
	}
} 
