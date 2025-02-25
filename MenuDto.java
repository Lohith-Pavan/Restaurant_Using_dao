package Jdbc.Restaurant_Using_dao;

public class MenuDto {
	String foodItem;
	int price;

	public MenuDto(String foodItem, int price) {
		this.foodItem = foodItem;
		this.price = price;
	}

	public String getFoodItem() {
		return foodItem;
	}

	public void setFoodItem(String foodItem) {
		this.foodItem = foodItem;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "foodItem = " + foodItem + ", price = " + price;
	}
}
