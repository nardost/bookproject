package bookproject;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component; //comes from spring-orm dependency
import org.springframework.transaction.annotation.Transactional;

@Component
public class BookLoanDao {
	@PersistenceContext private EntityManager em;	
	@Transactional
	public void persist(BookLoan bookLoan) {
		em.persist(bookLoan);
	}
	
	public List <BookLoan> getAllBookLoans() {
		TypedQuery <BookLoan> query = em.createQuery("SELECT b FROM BookLoan b ORDER BY b.id", BookLoan.class);
		return query.getResultList();
	}
}
