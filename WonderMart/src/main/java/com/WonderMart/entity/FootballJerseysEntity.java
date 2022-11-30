package com.WonderMart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="FootballJerseys")
public class FootballJerseysEntity 
{
	
// Declaration of variables	
	
// When Id is a primary key	
	@javax.persistence.Id
	
// we use AutoIncrement for Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String Name;
	private String Brand;
	private String Size;
	private int Price;
	private int Discount;
	private String Description;
	private String Category;
	public int getId() {
		return Id;
}
	
// Generate Getters And Setters 		
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getSize() {
		return Size;
	}
	public void setSize(String size) {
		Size = size;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int getDiscount() {
		return Discount;
	}
	public void setDiscount(int discount) {
		Discount = discount;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public void setId(int id) {
		Id = id;
	}
	
// Override toString Method(we get values in Hash Code if we are using this toString method then it convert it into String formate)
	@Override
	public String toString() {
		return "FootballJerseysEntity [Id=" + Id + ", Name=" + Name + ", Brand=" + Brand + ", Size=" + Size + ", Price="
				+ Price + ", Discount=" + Discount + ", Description=" + Description + ", Category=" + Category + "]";
	}
}
