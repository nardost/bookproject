package bookproject;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	Long id;
	private String name;
	private String email;
	
	public Person() {
	}

	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "{Name: " + name + ", Email: " + email + "}";
	}
}
