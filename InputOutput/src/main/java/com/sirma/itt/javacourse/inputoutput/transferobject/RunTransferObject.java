package com.sirma.itt.javacourse.inputoutput.transferobject;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1810 Run Transfer object class.
 * 
 * @author Petar Ivanov
 */
public class RunTransferObject {
	private static final Logger LOGGER = LoggerFactory.getLogger(RunTransferObject.class);

	/**
	 * Private constructor.
	 */
	private RunTransferObject() {
	}

	/**
	 * Runner for {@link TransferObject}.
	 * 
	 * @param args
	 *            Arguments for main method.
	 */
	public static void main(String[] args) {
		byte[] bytes = new byte[30];
		BufferedInputStream bufferedInput = new BufferedInputStream(new ByteArrayInputStream(bytes));
		ByteArrayOutputStream byteOutputStream = new ByteArrayOutputStream();
		for (int i = 0; i < bytes.length; i++) {
			bytes[i] = (byte) (i + ' ');
		}
		TransferObject objectTransfer = new TransferObject(bufferedInput, byteOutputStream);
		LOGGER.info(Arrays.toString(bytes));
		objectTransfer.transfer(10, 5);
		byte[] newBytes = byteOutputStream.toByteArray();
		LOGGER.info(Arrays.toString(newBytes));
	}
}
