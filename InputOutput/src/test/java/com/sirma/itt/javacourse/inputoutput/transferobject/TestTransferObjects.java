package com.sirma.itt.javacourse.inputoutput.transferobject;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import org.junit.Assert;
import org.junit.Test;

/**
 * ITTE-1810 Transfer object-test.
 * 
 * @author Petar Ivanov
 */
public class TestTransferObjects {
	/**
	 * Test transfer object method with args numberOfBytes - 5 and offset 2.
	 */
	@Test
	public final void test() {
		TransferObject objectTransfer;
		byte[] bytes = new byte[30];
		for (int i = 0; i < bytes.length; i++) {
			bytes[i] = (byte) (i + ' ');
		}
		BufferedInputStream bufferedInput = new BufferedInputStream(new ByteArrayInputStream(bytes));
		ByteArrayOutputStream byteOutputStream = new ByteArrayOutputStream();

		objectTransfer = new TransferObject(bufferedInput, byteOutputStream);
		objectTransfer.transfer(5, 2);
		byte[] expected = { 34, 35, 36, 37, 38 };
		Assert.assertArrayEquals(expected, byteOutputStream.toByteArray());
	}

	/**
	 * Test offset in which the result will not receive all the bytes that we
	 * ordered.
	 */
	@Test
	public final void testTwo() {
		TransferObject objectTransfer;
		byte[] bytes = new byte[30];
		for (int i = 0; i < bytes.length; i++) {
			bytes[i] = (byte) (i + ' ');
		}
		BufferedInputStream bufferedInput = new BufferedInputStream(new ByteArrayInputStream(bytes));
		ByteArrayOutputStream byteOutputStream = new ByteArrayOutputStream();

		objectTransfer = new TransferObject(bufferedInput, byteOutputStream);
		objectTransfer.transfer(25, 25);
		byte[] expected = { 57, 58, 59, 60, 61 };
		Assert.assertArrayEquals(expected, byteOutputStream.toByteArray());
	}

	/**
	 * Test offset at which transcends the array
	 */
	@Test
	public final void testThree() {
		TransferObject objectTransfer;
		byte[] bytes = new byte[30];
		for (int i = 0; i < bytes.length; i++) {
			bytes[i] = (byte) (i + ' ');
		}
		BufferedInputStream bufferedInput = new BufferedInputStream(new ByteArrayInputStream(bytes));
		ByteArrayOutputStream byteOutputStream = new ByteArrayOutputStream();

		objectTransfer = new TransferObject(bufferedInput, byteOutputStream);
		objectTransfer.transfer(200, 30);
		byte[] expected = {};
		Assert.assertArrayEquals(expected, byteOutputStream.toByteArray());
	}
}
