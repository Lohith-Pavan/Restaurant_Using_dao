package collectionPrograms;

import java.util.List;

public class RestaurantMain {
    public static void main(String args[]) {
    	RestaurantDaoInt rd = new RestaurantDaoImp();
    	List<MenuDto> l = rd.display();
    	System.out.println("--------------Menu---------------");
    	for(MenuDto x : l) {
    		System.out.println(x);
    	}
    	MenuDto ob = new MenuDto("Mutton biryani",400);
    	int i= rd.addItem(ob);
    	if(i>0) {
    		System.out.println("Item added successfully");
    	}else {
    		System.out.println("not added");
    	}
    	int j= rd.removeItem("Sambar Rice");
    	if(j>0) {
    		System.out.println("Item removed successfully");
    	}else {
    		System.out.println("not removed");
    	}
    }
}
