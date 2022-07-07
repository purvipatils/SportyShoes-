package com.shoeApp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PurchesReport {
	
	@Id
	@GeneratedValue
	private int id;
	private String purchasedBy;
	private String category;
	private int quntity;
	private double contact_no;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPurchasedBy() {
		return purchasedBy;
	}
	public void setPurchasedBy(String purchasedBy) {
		this.purchasedBy = purchasedBy;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getQuntity() {
		return quntity;
	}
	public void setQuntity(int quntity) {
		this.quntity = quntity;
	}
	public double getContact_no() {
		return contact_no;
	}
	public void setContact_no(double contact_no) {
		this.contact_no = contact_no;
	}
	
}
	
	
