package com.capgemini.bookstore.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {

   // @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long custId;

    //@NotEmpty(message="User Type is mandatory. Please provide user type")
    @Id
    private String firstName;

    //@NotEmpty(message="User Name is mandatory. Please provide user name")
    //@Size(min=2, message="Name should have atleast 5 characters")
    private String middleName;
    
    private String lastName;

    //@NotEmpty(message="User email is mandatory. Please provide user email")
    private String email;
    
    private String password;
    
    private Long custPhone;
    
    private String address;
    
    private Integer zipCode;
    
    private String country;

	public Customer() {
		
	}

	public Customer(Long custId, String firstName, String middleName, String lastName, String email, String password,
			Long custPhone, String address, Integer zipCode, String country) {
		super();
		this.custId = custId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.custPhone = custPhone;
		this.address = address;
		this.zipCode = zipCode;
		this.country = country;
	}

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getCustPhone() {
		return custPhone;
	}

	public void setCustPhone(Long custPhone) {
		this.custPhone = custPhone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
    
    
    

}