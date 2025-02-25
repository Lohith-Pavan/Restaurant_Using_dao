package Jdbc.Restaurant_Using_dao;

public class CustomerDto {
    String food_Item;
    int quantity;
	public CustomerDto(String food_Item, int quantity) {
		super();
		this.food_Item = food_Item;
		this.quantity = quantity;
	}
	public String getFood_Item() {
		return food_Item;
	}
	public void setFood_Item(String food_Item) {
		this.food_Item = food_Item;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "CustomerDto [food_Item=" + food_Item + ", quantity=" + quantity + "]";
	}
    
}
