package com.springmvc.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Profile {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String productName;
	private String Price;
	private String quality;
	public Profile(int id, String productName, String price, String quality) {
		super();
		this.id = id;
		this.productName = productName;
		Price = price;
		this.quality = quality;
	}
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	@Override
	public String toString() {
		return "Profile [id=" + id + ", productName=" + productName + ", Price=" + Price + ", quality=" + quality + "]";
	}
	public static boolean isValid(Profile profile) {
		if(profile.getPrice().isBlank() && profile.getProductName().isBlank() && profile.getQuality().isBlank()) {
			return false;
		}
		return true;
	}
	
	
	
}
