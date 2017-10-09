package bookprojectTest;

import java.sql.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import bookproject.Book;

public class TestBook {
	
	private static Book book;
	public TestBook() {
	}
	
	@BeforeClass
	public static void suiteSetup() {
		book = new Book("And Quiet Flows the Don", 568, "English", 1, Date.valueOf("1989-12-17"), "0679725210", "Mikhail Sholokhov");
	}
	
	@Test
	public void performFirstTest() {
		assertEquals("And Quiet Flows the Don", book.getTitle());
	}
	
	@Test
	public void performSecondTest() {
		assertTrue(book.getAuthor() != null);
	}
	
	@Test
	public void performThirdTest() {
		assertTrue(String.class.isInstance(book.getEdition()));
	}
	
	@After
	public void cleanupTest() {
		
	}
	@AfterClass
	public static void suiteFinished() {
		
	}
}
