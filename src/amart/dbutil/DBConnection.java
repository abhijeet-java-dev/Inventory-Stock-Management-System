    
package amart.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DBConnection {
    
  private static Connection con;

static{        
    
    
    
     
   try{
   Class.forName("com.mysql.cj.jdbc.Driver");
   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery?useSSL=false&allowPublicKeyRetrieval=true","root","root");
       JOptionPane.showMessageDialog(null,"Connection Opened Successfully !","Success",JOptionPane.INFORMATION_MESSAGE);
   }
   catch(ClassNotFoundException e1)
   {
       JOptionPane.showMessageDialog(null,"Error in loading driver","Driver Error",JOptionPane.ERROR_MESSAGE);
        e1.printStackTrace();
       System.exit(1);
   }
   catch(SQLException e2)
   {
       JOptionPane.showMessageDialog(null,"Error in Opening Connection "," DB Error",JOptionPane.ERROR_MESSAGE);
       e2.printStackTrace();
       System.exit(1);
   }
}

public static Connection getConnection()
{
   return con;
}

public static void closeConnection()
{
  try{
    con.close();
JOptionPane.showMessageDialog(null,"Connection Close Successfully !","Success",JOptionPane.INFORMATION_MESSAGE);
  }
  catch(SQLException e1)
  {
   JOptionPane.showMessageDialog(null,"Error in Closing Connection "," DB Error",JOptionPane.ERROR_MESSAGE);
   e1.printStackTrace();
  }
  
}
    
}
