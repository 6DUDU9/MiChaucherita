package model;

public class Category {
//	------------------ propiedades/Variables Privadas	-----------------------------------
	private int id;
	private String categoryName;
	private double value;
	
//	------------------------ BUILDER ------------------------
	public Category() {
		
	}
	public Category(int id, String categoryName, Double value) {
		this.id = id;
		this.categoryName = categoryName;
		this.value = value;
	}
	
//	------------------------ SET && GET ------------------------ 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	
	

//	------------------------ Methodes || Business Rules ------------------------
	
}
