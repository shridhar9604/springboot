package com.cg.entity.Item;

	import java.time.LocalDate;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;

	@Entity
	public class Item {
		@Id   
		 @GeneratedValue (strategy =GenerationType.IDENTITY)  
		    
		private int id;
		private String name;
		private LocalDate manufacturing;
		private LocalDate expiry;
	    private float price;
	    private String category;
	    private String shop;
	    
	    public Item (int id,String name,LocalDate manufacturing,LocalDate expiry,float price,String category,String shop) {
		
	super();
	this.id=id;
	this.name=name;
	this.manufacturing=manufacturing;
	this.expiry=expiry;
	this.price=price;
	this.category=category;
	this.shop=shop;
	    }
	    public Item() {
	    super()	;
	    }
	    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getManufacturing() {
		return manufacturing;
	}

	public void setManufacturing(LocalDate manufacturing) {
		this.manufacturing = manufacturing;
	}

	public LocalDate getExpiry() {
		return expiry;
	}

	public void setExpiry(LocalDate expiry) {
		this.expiry = expiry;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getShop() {
		return shop;
	}
	public void setShop(String shop) {
		this.shop = shop;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", manufacturing=" + manufacturing + ", expiry=" + expiry + ", price="
				+ price + ", category=" + category + ", shop=" + shop + "]";
	}
	
	

		
	}





