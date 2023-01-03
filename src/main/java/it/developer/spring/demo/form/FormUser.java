package it.developer.spring.demo.form;

import it.developer.spring.demo.model.User;

public class FormUser {
	
	private long id;
	
	private String firstname;
	
	private String lastname;

	public FormUser() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public User getUser() {
		
			User user = new User();
			user.setId(id);
			user.setFirstname(firstname);
			user.setLastname(lastname);
			return user;
		}
}
