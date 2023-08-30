package com.example.demo.model;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="orderPlace")
public class orderPlace {
private String name;
@Id
private Long phone_no;
private int id;
private String product;
private String price;
private String date;
@OneToMany(cascade = CascadeType.ALL)
@JoinColumn(name="link_id")
private List<orderTrack> many;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="join_id")
private LoginEntity one;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Long getPhone_no() {
	return phone_no;
}

public void setPhone_no(Long phone_no) {
	this.phone_no = phone_no;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getProduct() {
	return product;
}

public void setProduct(String product) {
	this.product = product;
}

public String getPrice() {
	return price;
}

public void setDestination(String price) {
	this.price = price;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public List<orderTrack> getMany() {
	return many;
}

public void setMany(List<orderTrack> many) {
	this.many = many;
}

public LoginEntity getOne() {
	return one;
}

public void setOne(LoginEntity one) {
	this.one = one;
}

public orderPlace(String name, Long phone_no, int id, String product, String price, String date,
		List<orderTrack> many, LoginEntity one) {
	super();
	this.name = name;
	this.phone_no = phone_no;
	this.id = id;
	this.product = product;
	this.price = price;
	this.date = date;
	this.many = many;
	this.one = one;
}

public orderPlace() {
	super();
	// TODO Auto-generated constructor stub
}


}