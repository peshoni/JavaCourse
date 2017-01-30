package com.sirma.itt.javacourse.collections.pagebean;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ITTE-1824 PageBean class.
 * 
 * Contains a list of elements and separates them on pages using the page size that is provided in the constructor.
 * Class contains methods for printing first, last and current pages, booleans hasNext and hasPrevious methods and the
 * readBook, which provides reading of the created book.
 * 
 * @author Petar Ivanov
 * @param <T>
 *            The type of the elements in the list.
 */
public class PageBean<T> {
	private static final Logger LOGGER = LoggerFactory.getLogger(PageBean.class);
	private static final String NL = System.lineSeparator();
	private List<T> listOfElements;
	private HashMap<Integer, Page> book;
	private int pageSize;
	private int currentPage;
	private int numberOfPages;

	/**
	 * Constructs book. The number of pages is determined by the size of the input list
	 * 
	 * @param list
	 *            Input list.
	 * @param sizeOfPage
	 *            Determines how many elements must we have in page.
	 */
	public PageBean(List<T> list, int sizeOfPage) {
		listOfElements = list;
		this.pageSize = sizeOfPage;
		book = new HashMap<>();
		numberOfPages = Math.incrementExact(list.size() / pageSize);
		fillBook(listOfElements);
	}

	/**
	 * Create book.
	 * 
	 * @param list
	 *            List for processing
	 */
	private void fillBook(List<T> list) {
		int start = 0;
		int end = pageSize;
		for (int i = 0; i < numberOfPages; i++) {
			int size = list.size();
			if (end > size) {
				end = size;
			}
			book.put(i + 1, new Page(list.subList(start, end).toString()));
			list.subList(start, end).clear();
		}
	}

	/**
	 * Print current page.
	 * 
	 * @param pageNumber
	 *            Number of page to print.
	 * @return String with elements of the currentPage.
	 */
	public String printPage(int pageNumber) {
		LOGGER.info(book.get(pageNumber).getText());
		return book.get(pageNumber).getText();
	}

	/**
	 * Moves to the next page if available.
	 * 
	 * @return String with page content.
	 */
	public String nextPage() {
		if (hasNextPage()) {
			return printPage(++currentPage);
		}
		LOGGER.info("THE END!");
		return null;
	}

	/**
	 * Moves to the previous page if available.
	 * 
	 * @return String with page content.
	 */
	public String previous() {
		if (hasPrevious()) {
			return printPage(--currentPage);
		}
		LOGGER.info("This is the first page of the book. ");
		return null;
	}

	/**
	 * Checks whether a next element.
	 * 
	 * @return True if there is a next element.
	 */
	public boolean hasNextPage() {
		if (currentPage >= numberOfPages) {
			return false;
		}
		return true;
	}

	/**
	 * Checks whether a previous element.
	 * 
	 * @return True if there is a previous element.
	 */
	public boolean hasPrevious() {
		if (currentPage <= 1) {
			return false;
		}
		return true;
	}

	/**
	 * Prints the first page.
	 * 
	 * @return String of elements from the first page.
	 */
	public String firstPage() {
		return printPage(1);
	}

	/**
	 * Prints the last page.
	 * 
	 * @return String with elements of the last page.
	 */
	public String lastPage() {
		return printPage(numberOfPages);
	}

	/**
	 * Getter method for numberOfPages.
	 * 
	 * @return total number of pages.
	 */
	public int getSize() {
		return numberOfPages;
	}

	/**
	 * Getter method for currentPage.
	 *
	 * @return the currentPage
	 */
	public int getCurrentPage() {
		return currentPage;
	}

	/**
	 * Setter method for currentPage.
	 *
	 * @param currentPage
	 *            the currentPage to set
	 */
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	/**
	 * Method for reading the generated book. Pages are scrolled by entering in console symbols '+' and '-'. Reading
	 * stops when entering the symbol '*'.
	 * 
	 * @param input
	 *            For user input.
	 * @param startPage
	 *            Page to start reading.
	 * @throws IOException
	 */

	public void readBook(BufferedReader input, int startPage) throws IOException {
		if (startPage < 1 || startPage > numberOfPages) {
			LOGGER.info("No such page in this book.");
		} else {
			currentPage = startPage;
			printPage(currentPage);
			LOGGER.info(NL + "Previous page (- and ENTER), Next page (+ and ENTER), End of reading(* and ENTER).");
			char symbol;
			BufferedReader in = input;
			try {
				do {
					symbol = (char) input.read();
					switch (symbol) {
					case '+':
						nextPage();
						break;
					case '-':
						previous();
						break;
					default:
						break;
					}
				} while (symbol != '*');
			} finally {
				in.close();
			}
			LOGGER.info("Bye-bye!");
		}
	}
}
