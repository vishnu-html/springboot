package com.example.demo.Table.model;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Details")
public class TransientModel {
	 @Id
	 @GeneratedValue (strategy = GenerationType.IDENTITY)
	 private int productId;
	 @jakarta.persistence.Transient
	 private String productName;
	 private String productQuality;
	 private int productPrice;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductQuality() {
		return productQuality;
	}
	public void setProductAddress(String productQuality) {
		this.productQuality = productQuality;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	
	
	
}
