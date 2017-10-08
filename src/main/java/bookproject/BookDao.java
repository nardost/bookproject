package bookproject;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component; //comes from spring-orm dependency
import org.springframework.transaction.annotation.Transactional;

@Component
public class BookDao {
	@PersistenceContext private EntityManager em;	
	@Transactional
	public void persist(Book book) {
		em.persist(book);
	}
	
	public List <Book> getAllBooks() {
		TypedQuery <Book> query = em.createQuery("SELECT b FROM Book b ORDER BY b.id", Book.class);
		return query.getResultList();
	}
	
	public Book getBookById(Long id) {
		TypedQuery <Book> query = em.createQuery("SELECT b FROM Book b ORDER BY b.id", Book.class);
		List <Book> list =  query.getResultList();
		for(Book b : list) {
			if(b.getId() == id) return b;
		}
		return null;
	}
}