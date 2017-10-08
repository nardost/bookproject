package bookproject;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BookLoan implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue
	Long id;
	private Book book;
	private Person borrower;
	private Date dateBorrowed;
	private Date dateReturned;
	
	public BookLoan() {
	}

	public BookLoan(Book book, Person borrower, Date dateBorrowed, Date dateReturned) {
		this.book = book;
		this.borrower = borrower;
		this.dateBorrowed = dateBorrowed;
		this.dateReturned = dateReturned;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Person getBorrower() {
		return borrower;
	}

	public void setBorrower(Person borrower) {
		this.borrower = borrower;
	}

	public Date getDateBorrowed() {
		return dateBorrowed;
	}

	public void setDateBorrowed(Date dateBorrowed) {
		this.dateBorrowed = dateBorrowed;
	}

	public Date getDateReturned() {
		return dateReturned;
	}

	public void setDateReturned(Date dateReturned) {
		this.dateReturned = dateReturned;
	}

	public Long getId() {
		return id;
	}
}
