package collectionPrograms;

import java.util.List;

interface RestaurantDaoInt {
      public int addItem(MenuDto ob);
     public int removeItem(String item);
     public List<MenuDto> display();
      
}
