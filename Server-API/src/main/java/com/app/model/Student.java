package com.app.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	 @NotBlank(message = "First name is mandatory")
	    private String firstName;

	    @NotBlank(message = "Last name is mandatory")
	    private String lastName;

	    @Email(message = "Email should be valid")
	    @NotBlank(message = "Email is mandatory")
	    private String email;

	    @NotBlank(message = "Address is mandatory")
	    private String address;

	    @Min(value = 13, message = "Age should not be less than 0")
	     @Max(value = 73, message = "Age should not be less than 0")
	    private int age;

	    @Past(message = "Date of birth should be in the past")
	    @NotNull(message = "Date of birth is mandatory")
	    private LocalDate dateOfBirth;
	
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	/*
	 * 
	 * 
	 * @NotBlank(message = "First name is mandatory")
    private String firstName;

    @NotBlank(message = "Last name is mandatory")
    private String lastName;

    @Email(message = "Email should be valid")
    @NotBlank(message = "Email is mandatory")
    private String email;

    @NotBlank(message = "Address is mandatory")
    private String address;

    @Min(value = 13, message = "Age should not be less than 0")
     @Max(value = 73, message = "Age should not be less than 0")
    private int age;

    @Past(message = "Date of birth should be in the past")
    @NotNull(message = "Date of birth is mandatory")
    private LocalDate dateOfBirth;
	 * 
	 */
	
	
	
	
}
