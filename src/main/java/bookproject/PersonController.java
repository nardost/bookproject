package bookproject;

import javax.servlet.http.HttpServletRequest; //comes from servlet-api dependency

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping; //spring-webmvc dependency
import org.springframework.web.servlet.ModelAndView; //comes from spring-webmvc dependency

@Controller
public class PersonController {
	@Autowired
	private PersonDao personDao;
	
	@RequestMapping(value="/person")
	public ModelAndView personEntry(HttpServletRequest request) {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		if(name != null) {
			if(email == null) email = "";
			personDao.persist(new Person(name, email));
		}
		return new ModelAndView("person.jsp", "personDao", personDao);
	}
}
