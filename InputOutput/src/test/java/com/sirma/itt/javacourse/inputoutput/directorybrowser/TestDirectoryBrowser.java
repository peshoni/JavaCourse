package com.sirma.itt.javacourse.inputoutput.directorybrowser;

import org.junit.Assert;
import org.junit.Test;

/**
 * ITTE-1811 -Test Directory browser class.
 * 
 * @author Petar Ivanov
 */
public class TestDirectoryBrowser {

	/**
	 * Test with path to existing file.
	 */
	@Test
	public void testWithPathToFile() {
		String secondPath = "serializedObject.txt";
		String expected = "File";
		Assert.assertEquals(expected, DirectoryBrowser.fileOrDir(secondPath));
	}

	/**
	 * Test with path to non-existing file.
	 */
	@Test
	public void testWithPathToNonExistingFile() {
		String noSuchFile = "@@@.@@@";
		String expected = "ERROR";
		Assert.assertEquals(expected, DirectoryBrowser.fileOrDir(noSuchFile));
	}

	/**
	 * Test with path to current directory.
	 */
	@Test
	public void testWithPathToDirectory() {
		String path = ".";
		String expected = "Directory";
		Assert.assertEquals(expected, DirectoryBrowser.fileOrDir(path));
	}
}
