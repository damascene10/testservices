package com.ac.testservices.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Table(name = "student", 
uniqueConstraints = {@UniqueConstraint(name="st_email",columnNames="email")})
@Entity(name = "Student")
public class Student {
	@Id
	@SequenceGenerator(name = "sq_student", sequenceName = "sq_student", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_student")
	//For auto increment 
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false,columnDefinition = "serial")
//	@Column(name = "id", nullable = false, updatable = false)
	private Long id;
	@Column(name = "firstName", nullable = false, length = 100)
	private String firstName;
	@Column(name = "lastName", nullable = false, length = 50)
	private String lastName;

	@Column(name = "email", length = 100)
	private String email;
	
	private int age;

	/**
	 * 
	 */
	public Student() {
	}

	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param age
	 */
	public Student(long id, String firstName, String lastName, String email, int age) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
	}

	public Student(String firstName, String lastName, String email, int age) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", age=" + age + "]";
	}

}
