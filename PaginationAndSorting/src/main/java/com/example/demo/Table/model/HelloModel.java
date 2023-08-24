package com.example.demo.Table.model;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PersonDetails")
public class HelloModel {
	 @Id
	 @GeneratedValue (strategy = GenerationType.IDENTITY)
	 private int personId;
	 private String personName;
	 private String personAddress;
	 private int personAge;
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPersonAddress() {
		return personAddress;
	}
	public void setPersonAddress(String personAddress) {
		this.personAddress = personAddress;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonRank(int personAge) {
		this.personAge = personAge;
	}
	
	
}
