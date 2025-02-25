package Jdbc.Restaurant_Using_dao;

import java.util.List;

interface CustomerDaoInt {
     public int addOrder(CustomerDto ob);
     public int removeOrder(String item);
     public List<CustomerDto> displayOrders();
     public int bill();
}
