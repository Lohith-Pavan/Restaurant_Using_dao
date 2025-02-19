package collectionPrograms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;

public class RestaurantDaoImp implements RestaurantDaoInt{
	@Override
	
	 public int addItem(MenuDto ob) {
		int i=0;
		Connection con = Dbcon.getCon();
		String query = "insert into menu values (?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, ob.foodItem);
			ps.setInt(2, ob.price);
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int removeItem(String item) {
		int i=0;
		Connection con = Dbcon.getCon();
		String query = "delete from menu where FoodItem = ?";
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
	public List<MenuDto> display() {
		List<MenuDto> l = new ArrayList<>();
		MenuDto i;
		Connection con = Dbcon.getCon();
		String query = "select * from menu";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				String item = rs.getString(1);
				int price = rs.getInt(2);
				i = new MenuDto(item,price);
				l.add(i);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}

}
