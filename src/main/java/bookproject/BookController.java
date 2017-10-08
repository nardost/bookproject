package bookproject;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest; //comes from servlet-api dependency

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping; //spring-webmvc dependency
import org.springframework.web.servlet.ModelAndView; //comes from spring-webmvc dependency

@Controller
public class BookController {
	
	@Autowired
	private BookDao bookDao;
	
	@RequestMapping(value="/book")
	public ModelAndView bookEntry(HttpServletRequest request) {
		Book book = new Book("String title", 1000, "String language", 30, Date.valueOf("1990-01-01"), "String isbn", "String author");
		if(request.getParameter("submit") != null) {
			String title;
			int pages;
			String language;
			int edition;
			Date published;
			String isbn;
			String author;
			
			title = request.getParameter("title");
			if(title != null) {
				author = request.getParameter("author");
				pages = Integer.parseInt(request.getParameter("pages"));
				language = request.getParameter("language");
				edition = Integer.parseInt(request.getParameter("edition"));
				published = Date.valueOf(request.getParameter("published"));
				isbn = request.getParameter("isbn");
				
				bookDao.persist(new Book(title, pages, language, edition, published, isbn, author));
			}
			return new ModelAndView("book.jsp", "bookDao", bookDao);
		} else if (request.getParameter("get-book-by-id") != null) {
			book = bookDao.getBookById(Long.parseLong(request.getParameter("id")));
			if(book == null) return new ModelAndView("person.jsp");//, "bookFound", book);
			return new ModelAndView("book.jsp", "bookFound", book);
		}
		return new ModelAndView("book.jsp", "book", book);
	}
}
