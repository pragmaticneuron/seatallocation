package com.test.rest.model;

public class Product {

	private String productname;
	private String category;
	private Integer quantity;
	private String region;
	
	public Product() {
		this.productname = "productname";
		this.category = "category";
		this.quantity = 1;
		this.region = "region";
	}
	
	
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	
	

	

}