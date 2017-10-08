package bookproject;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component; //comes from spring-orm dependency
import org.springframework.transaction.annotation.Transactional;

@Component
public class PersonDao {

	@PersistenceContext private EntityManager em;
	
	@Transactional
	public void persist(Person person) {
		em.persist(person);
	}
	
	public List <Person> getAllPersons() {
		TypedQuery <Person> query = em.createQuery("SELECT b FROM Person b ORDER BY b.id", Person.class);
		return query.getResultList();
	}
}