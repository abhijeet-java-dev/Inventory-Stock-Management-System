
package amart.dao;

import amart.dbutil.DBConnection;
import amart.pojo.ProductsPojo;
import amart.pojo.UserProfile;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OrderDAO {
  public static String getNextOrderId() throws SQLException
{
    Connection con = DBConnection.getConnection();
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("SELECT MAX(CAST(SUBSTRING(order_id,4) AS UNSIGNED)) FROM orders");
    if (rs.next()) {
        int orderno = rs.getInt(1);
        if (rs.wasNull())
            return "ORT101";
        orderno++;
        return "ORT"+orderno;
    }
    return "ORT101";
}

    public static boolean addOrder(ArrayList<ProductsPojo> al,String ordId)throws SQLException
    {
     Connection con=DBConnection.getConnection();
     PreparedStatement ps=con.prepareStatement("INSERT INTO orders(order_id, p_id, quantity, userid) VALUES(?,?,?,?)");
     int count=0;
     for(ProductsPojo p:al)
     {
     ps.setString(1,ordId);
     ps.setString(2,p.getProductId());
     ps.setInt(3,p.getQuantity());
     ps.setString(4,UserProfile.getUserid());
     count=count+ps.executeUpdate();
     
     }
     return count==al.size();
     
    } 

    
    public ResultSet getAllOrders() {
    try {
        Connection con = DBConnection.getConnection();

        String sql = "select order_id from orders ";
        PreparedStatement ps = con.prepareStatement(sql);
        
        
        return ps.executeQuery();

    } catch (Exception e) {
        e.printStackTrace();
        return null;
    }
}
    
    public static List<String> getOrderIds() {

    List<String> list=new ArrayList<>();

    try {
        Connection con = DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement("SELECT order_id FROM orders");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            list.add(rs.getString("order_id"));
        }

    } catch (Exception e) {
        e.printStackTrace();
    }

    return list;
}
}
