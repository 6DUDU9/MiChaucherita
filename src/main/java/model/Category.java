package model;

public class Category {
//	------------------ propiedades/Variables Privadas	-----------------------------------
	private int id;
	private String categoryName;
	
//	------------------------ BUILDER ------------------------
	public Category() {
		
	}
	public Category(int id, String categoryName) {
		this.id = id;
		this.categoryName = categoryName;
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

//	------------------------ Methodes || Business Rules ------------------------
	
}
