package com.vegetable.model;




public class Vegetable {
	
	 private String Vegetable_List;
	 private Integer Vegetable_Quantity;
     private Integer Vegetable_Price;
     
     
     
	public Vegetable(String vegetable_List, Integer vegetable_Quantity, Integer vegetable_Price) {
		super();
		this.Vegetable_List = vegetable_List;
		this.Vegetable_Quantity = vegetable_Quantity;
		this.Vegetable_Price = vegetable_Price;
	}



	public String getVegetable_List() {
		return Vegetable_List;
	}



	public void setVegetable_List(String vegetable_List) {
		Vegetable_List = vegetable_List;
	}



	public Integer getVegetable_Quantity() {
		return Vegetable_Quantity;
	}



	public void setVegetable_Quantity(Integer vegetable_Quantity) {
		Vegetable_Quantity = vegetable_Quantity;
	}



	public Integer getVegetable_Price() {
		return Vegetable_Price;
	}



	public void setVegetable_Price(Integer vegetable_Price) {
		Vegetable_Price = vegetable_Price;
	}



	@Override
	public String toString() {
		return "Vegetable [Vegetable_List=" + Vegetable_List + ", Vegetable_Quantity=" + Vegetable_Quantity
				+ ", Vegetable_Price=" + Vegetable_Price + "]";
	}
     
     

}
