package Jdbc.Restaurant_Using_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImp implements CustomerDaoInt{

	@Override
	public int addOrder(CustomerDto ob) {
		int i=0;
		Connection con = Dbcon.getCon();
		String query = "insert into customer values (?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, ob.getFood_Item());
			ps.setInt(2, ob.getQuantity());
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int removeOrder(String item) {
		int i=0;
		Connection con = Dbcon.getCon();
		String query = "delete from customer where ordered_Item = ?";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, item);
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public List<CustomerDto> displayOrders() {
		List<CustomerDto> l = new ArrayList<>();
		CustomerDto ob;
		Connection con = Dbcon.getCon();
		String query = "select * from customer";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				String foodItem = rs.getString(1);
				int quantity = rs.getInt(2);
				ob = new CustomerDto(foodItem,quantity);
				l.add(ob);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}

	@Override
	public int bill() {
		int bill=0;
		Connection con = Dbcon.getCon();
		String query = "select c.ordered_Item,m.price,c.quantity from customer c inner join menu m on c.ordered_Item = m.food_Item";
	    try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				bill+=(rs.getInt(2) * rs.getInt(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return bill;
	}

}
