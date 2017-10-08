package bookprojectTest;

import java.sql.Date;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import bookproject.Book;

public class TestBook {
	Book book = new Book("And Quiet Flows the Don", 1000, "String language", 30, Date.valueOf("1990-01-01"), "String isbn", "String author");
	@Test
	public void performFirstTest() {
		assertEquals("And Quiet Flows the Don", book.getTitle());
	}
}
