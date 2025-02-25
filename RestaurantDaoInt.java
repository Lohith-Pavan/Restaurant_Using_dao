package Jdbc.Restaurant_Using_dao;

import java.util.List;

interface RestaurantDaoInt {
      public int addItem(MenuDto ob);
     public int removeItem(String item);
     public List<MenuDto> displayMenu();
      
}
