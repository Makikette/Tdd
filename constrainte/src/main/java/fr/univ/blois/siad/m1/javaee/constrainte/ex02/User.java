package fr.univ.blois.siad.m1.javaee.constrainte.ex02;

/**
 * @author: François Robert
 */
public class User {

	private String name;

	private String surname;

	private Address address;

	public User() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
