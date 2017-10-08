package bookproject;


import javax.servlet.http.HttpServletRequest; //comes from servlet-api dependency

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping; //spring-webmvc dependency
import org.springframework.web.servlet.ModelAndView; //comes from spring-webmvc dependency

@Controller
public class BookLoanController {
	@Autowired
	private BookLoanDao bookLoanDao;
	
	@RequestMapping(value="/loan")
	public ModelAndView bookLoanEntry(HttpServletRequest request) {
		String bookId = request.getParameter("bookId");
		String personId = request.getParameter("personId");
		
		return new ModelAndView("loan.jsp", "bookLoanDao", bookLoanDao);
	}
}
