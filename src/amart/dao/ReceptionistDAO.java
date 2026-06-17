
package amart.dao;

import amart.dbutil.DBConnection;
import amart.pojo.ReceptionistPojo;
import amart.pojo.UserPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class ReceptionistDAO {
    
    public static Map<String,String> getNonRegisteredReceptionists()throws SQLException
    {
    Connection con=DBConnection.getConnection();
    Statement st=con.createStatement();
  ResultSet rs=st.executeQuery("select empid,empname from employees where job='Receptionist' and empid not in (select empid from users where usertype='Receptionist')");
    HashMap <String , String> receptionistList=new HashMap<>();
    while(rs.next())
    {
      String id=rs.getString(1);
      String name=rs.getString(2);
      receptionistList.put(id,name);
    
    }
    return receptionistList;
    }
    public static boolean addReceptionist(UserPojo user) throws SQLException
    {
     Connection con=DBConnection.getConnection();
     PreparedStatement ps=con.prepareStatement("insert into users values(?,?,?,?,?)");
     ps.setString(1,user.getUserid());
     ps.setString(2,user.getEmpid());
     ps.setString(3,user.getPassword());
     ps.setString(4,user.getUsertype());
     ps.setString(5,user.getUsername());
  
     int result=ps.executeUpdate();
    return result==1;
    }
    
    public static List<ReceptionistPojo> getAllReceptionstDetails()throws SQLException
    {
     Connection con=DBConnection.getConnection();
      Statement st=con.createStatement();
     ResultSet rs=st.executeQuery("select users.empid,empname,userid,job,salary from users,employees where usertype='Receptionist' and users.empid=employees.empid"
     
     );
     ArrayList<ReceptionistPojo> al=new ArrayList<>();
      while(rs.next())
      {
       ReceptionistPojo recep=new ReceptionistPojo();
       recep.setEmpid(rs.getString(1));
       recep.setEmpname(rs.getString(2));
       recep.setUserid(rs.getString(3));
       recep.setJob(rs.getString(4));
       recep.setSalary(rs.getDouble(5));
       al.add(recep);
       
      }
      return al;
     
    }
    public static Set<String> getAllReceptionistId() throws SQLException
    {
      Connection con=DBConnection.getConnection();
      Statement st=con.createStatement();
      ResultSet rs=st.executeQuery("select userid from users where usertype='Receptionist' order by userid");
    Set<String> allId=new HashSet<>();
      while(rs.next())
     {
      allId.add(rs.getString(1));
     }
  return allId;   
    }
    public static Map<String,String> getAllReceptionists() throws SQLException 
    {
    Connection con=DBConnection.getConnection();
    Statement st=con.createStatement();
  ResultSet rs=st.executeQuery("select userid,username from users where usertype='Receptionist' order by userid");
    HashMap <String , String> receptionistList=new HashMap<>();
    while(rs.next())
    {
      String id=rs.getString(1);
      String name=rs.getString(2);
      receptionistList.put(id,name);
    
    }
    return receptionistList;
    } 
    public static boolean updatePassword(String userid,String pwd) throws SQLException 
    {
     Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement("update users set password=? where userid=?");
        ps.setString(1, pwd);
        ps.setString(2, userid);
        return ps.executeUpdate()==1;
    } 
    public static boolean deleteReceptionist(String userid) throws SQLException
    {
     Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement("delete from users where userid=?");
        ps.setString(1,userid);
        return ps.executeUpdate()==1;
    }       
}
