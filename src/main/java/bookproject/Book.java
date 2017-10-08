package bookproject;

import java.io.Serializable;
import javax.persistence.Entity; //comes from the com.objectdb dependency
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.sql.Date;

@Entity
public class Book implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	Long id;
	private String title;
	private int pages;
	private String language;
	private int edition;
	private Date published;
	private String isbn;
	private String author;
	
	public Book() {
	}
	
	public Book(String title, int pages, String language, int edition, Date published, String isbn, String author) {
		this.title = title;
		this.pages = pages;
		this.language = language;
		this.edition = edition;
		this.published = published;
		this.isbn = isbn;
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
	public Date getPublished() {
		return published;
	}
	public void setPublished(Date published) {
		this.published = published;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "{title: " + title + ", author: "+ author + "}";
	}
}
