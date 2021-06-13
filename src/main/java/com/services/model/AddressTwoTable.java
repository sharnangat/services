package com.services.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Table2")
public class AddressTwoTable {	
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	@Column(name="id")
	private Long id;
	
	
	@Column(name="street")
	private String street;
	
	
	@Column(name="city")
	private String city;

  
    @OneToOne(mappedBy = "address",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private UserOneTable tabel1;

	
	
	

	

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public UserOneTable getTabel1() {
		return tabel1;
	}


	public void setTabel1(UserOneTable tabel1) {
		this.tabel1 = tabel1;
	}

	
	
}
