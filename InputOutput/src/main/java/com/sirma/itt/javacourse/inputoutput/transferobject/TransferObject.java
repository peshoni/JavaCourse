package com.sirma.itt.javacourse.inputoutput.transferobject;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1810 Transfer object
 * 
 * @author Petar Ivanov
 */
public class TransferObject {
	private static final Logger LOGGER = LoggerFactory.getLogger(TransferObject.class);
	private InputStream input;
	private OutputStream output;

	/**
	 * Constructor of the TransferObject class.
	 * 
	 * @param input
	 *            Extending the InputStream abstract class.
	 * @param output
	 *            Extending the OutputStream abstract class.
	 */
	public TransferObject(InputStream input, OutputStream output) {
		this.input = input;
		this.output = output;
	}

	/**
	 * Reads given number of bytes after given offset from the input and stores them to the
	 * {@link ByteArrayOutputStream}.
	 * 
	 * @param numberOfBytes
	 *            Number of bytes to transfer
	 * @param offset
	 *            Number of bytes to be skipped
	 * @return The number of transferred bytes.
	 */
	public int transfer(int numberOfBytes, int offset) {
		int neededBytes = numberOfBytes + offset;
		byte[] inputBytes = new byte[neededBytes];
		try {
			neededBytes = input.read(inputBytes);
			if (neededBytes < offset) {
				LOGGER.info("No bytes to transfer then offset!");
				return 0;
			}
			neededBytes -= offset;
			byte[] printBytes = new byte[neededBytes];
			System.arraycopy(inputBytes, offset, printBytes, 0, neededBytes);
			output.write(printBytes);
		} catch (IOException e) {
			LOGGER.info("Occurs I/O exception: ", e);
		}
		if (neededBytes < numberOfBytes) {
			LOGGER.info(String.format("%s %s", neededBytes, " bytes transferred."));
		}
		return neededBytes;
	}
}
