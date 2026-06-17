
package amart.dao;
import amart.dbutil.DBConnection;
import amart.pojo.PaymentPojo;
import java.sql.*;


public class PaymentDAO {
    
  public static boolean savePayment(PaymentPojo p) {
    try {
        Connection con = DBConnection.getConnection();

        PreparedStatement ps = con.prepareStatement(
            "INSERT INTO payments(order_id, amount, payment_mode, transaction_id, payment_status) VALUES(?,?,?,?,?)"
        );

        ps.setString(1,p.getOrderId());
        ps.setDouble(2,p.getAmount());
        ps.setString(3,p.getPaymentMode());
        ps.setString(4,p.getTransactionId());
        ps.setString(5,p.getPaymentStatus());

        return ps.executeUpdate()>0;

    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
}
   

   
    
}
    
