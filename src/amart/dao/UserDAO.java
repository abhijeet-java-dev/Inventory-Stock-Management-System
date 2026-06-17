
package amart.dao;

import amart.dbutil.DBConnection;
import amart.pojo.UserPojo;
import amart.pojo.UserProfile;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UserDAO {
   public static boolean validateUser(UserPojo user) throws SQLException {
    Connection con = DBConnection.getConnection();
    PreparedStatement ps = con.prepareStatement("select * from users where userid=? and password=? and usertype=?");
    
    ps.setString(1, user.getUserid());
    ps.setString(2, user.getPassword());
    ps.setString(3, user.getUsertype());

    ResultSet rs = ps.executeQuery();
    if (rs.next())
    {
        UserProfile.setUsername(rs.getString("username"));
        return true;
    }
    else
    {
    return false;
    }
}
   public static boolean isUserPresnt(String empid)throws SQLException
   {
   Connection con = DBConnection.getConnection();
    PreparedStatement ps = con.prepareStatement("select 1 from users where empid=?");
    ps.setString(1, empid);
    ResultSet rs = ps.executeQuery();
    return rs.next();
    
   
   }  

    
}
