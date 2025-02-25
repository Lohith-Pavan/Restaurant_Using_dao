package Jdbc.Restaurant_Using_dao;

import java.util.List;

public class RestaurantMain {
    public static void main(String args[]) {
    	RestaurantDaoInt rd = new RestaurantDaoImp();
    	List<MenuDto> l = rd.displayMenu();
    	System.out.println("--------------Menu---------------");
    	for(MenuDto x : l) {
    		System.out.println(x);
    	}
    	CustomerDaoInt cd = new CustomerDaoImp();
    	CustomerDto c1 = new CustomerDto("Sambar rice",2);
    	CustomerDto c2 = new CustomerDto("Mutton Biryani",1);
    	int i = cd.addOrder(c1);
    	if(i>0) {
    		System.out.println("item added");
    	}
    	else {
    		System.out.println("item not added");
    	}
    	int j = cd.addOrder(c2);
    	if(j>0) {
    		System.out.println("item added");
    	}
    	else {
    		System.out.println("item not added");
    	}
    	int bill = cd.bill();
    	System.out.println("the bill is : "+bill);
    }
}
