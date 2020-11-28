package ashishpress;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Database {
    
    public Connection conn=null;
    PreparedStatement pstmt=null;
     ResultSet rs=null;
     
     
    public Database()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashishpress","root","");
//            Class.forName("org.sqlite.JDBC");
//            conn = DriverManager.getConnection("jdbc:sqlite:ashishpress.db");
            System.out.println("Connected");
        }
        catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
    
    
    public static Connection koneksiDb(){
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection filekoneksi = DriverManager.getConnection("jdbc:mysql://localhost/ashishpress","root","");
//        Class.forName("org.sqlite.JDBC");
//       Connection filekoneksi = DriverManager.getConnection("jdbc:sqlite:ashishpress.db");
        System.out.println("Connection Success");
        return filekoneksi;
    }
    catch (Exception e){
        System.out.println("Connection error");
        return null;
    }
}
    
    public int save_purchase( String date,String party_name,String invoice_no,String payment_method,String purchased_item,String quantity,double debit,double credit,double amount,String remarks)
    {
        int result=0;
        try {
            pstmt=conn.prepareStatement("insert into purchase values(?,?,?,?,?,?,?,?,?,?,?)");
            pstmt.setInt(1,0);
            pstmt.setString(2,date);
            pstmt.setString(3,party_name);
            pstmt.setString(4,invoice_no);
             pstmt.setString(5,payment_method);
             pstmt.setString(6,purchased_item);
            pstmt.setString(7,quantity);
            pstmt.setDouble(8,debit);
            pstmt.setDouble(9,credit);
             pstmt.setDouble(10,amount);
            pstmt.setString(11,remarks);
            result=pstmt.executeUpdate();
        }
        catch (Exception e) {
            System.out.println("Error: "+e);
        }
            return result;
    }
    
     public int save_sales( String date,String party_name,String invoice_no,String payment_method,String sale_item,String quantity,double debit,double credit,double amount,String remarks)
    {
        int result=0;
        try {
            pstmt=conn.prepareStatement("insert into sales values(?,?,?,?,?,?,?,?,?,?,?)");
            pstmt.setInt(1,0);
            pstmt.setString(2,date);
            pstmt.setString(3,party_name);
            pstmt.setString(4,invoice_no);
             pstmt.setString(5,payment_method);
             pstmt.setString(6,sale_item);
            pstmt.setString(7,quantity);
            pstmt.setDouble(8,debit);
            pstmt.setDouble(9,credit);
             pstmt.setDouble(10,amount);
            pstmt.setString(11,remarks);
            result=pstmt.executeUpdate();
        }
        catch (Exception e) {
            System.out.println("Error: "+e);
        }
            return result;
    }
    
    
      public int update_purchase( String date,String party_name,String invoice_no,String payment_method,String purchased_item,String quantity,double debit,double credit,double amount,String remarks,String value)
    {    
        int result=0;
        try {
           
            pstmt=conn.prepareStatement("update purchase set date=?, party_name=?, invoice_no=?,payment_method=?, purchased_item=?, quantity=?, debit=?, credit=?,amount=?, remarks=? where purchased_id="+value);
          pstmt.setString(1,date);
            pstmt.setString(2,party_name);
            pstmt.setString(3,invoice_no);
              pstmt.setString(4,payment_method);  
             pstmt.setString(5,purchased_item);
            pstmt.setString(6,quantity);
            pstmt.setDouble(7,debit);
            pstmt.setDouble(8,credit);
             pstmt.setDouble(9,amount);
            pstmt.setString(10,remarks);  
            result=pstmt.executeUpdate();
        }
        catch (Exception e) {
            System.out.println("Error: "+e);
        }
           
            return result;
        
    }
      
       public int update_sales( String date,String party_name,String invoice_no,String payment_method,String sale_item,String quantity,double debit,double credit,double amount,String remarks,String value)
    {    
        int result=0;
        try {
           
            pstmt=conn.prepareStatement("update sales set date=?, party_name=?, invoice_no=?,payment_method=?, sale_item=?, quantity=?, debit=?, credit=?,amount=?, remarks=? where sale_id="+value);
          pstmt.setString(1,date);
            pstmt.setString(2,party_name);
            pstmt.setString(3,invoice_no);
              pstmt.setString(4,payment_method);  
             pstmt.setString(5,sale_item);
            pstmt.setString(6,quantity);
            pstmt.setDouble(7,debit);
            pstmt.setDouble(8,credit);
             pstmt.setDouble(9,amount);
            pstmt.setString(10,remarks);  
            result=pstmt.executeUpdate();
        }
        catch (Exception e) {
            System.out.println("Error: "+e);
        }
           
            return result;
        
    }
     
      
      
      public int save_purchase_history( String date,String party_name,String invoice_no,String payment_method,String purchased_item,String quantity,double debit,double credit,double amount,String remarks)
    {
        int result=0;
        try {
            pstmt=conn.prepareStatement("insert into purchase_history values(?,?,?,?,?,?,?,?,?,?,?)");
            pstmt.setInt(1,0);
            pstmt.setString(2,date);
            pstmt.setString(3,party_name);
            pstmt.setString(4,invoice_no);
             pstmt.setString(5,payment_method);
             pstmt.setString(6,purchased_item);
            pstmt.setString(7,quantity);
            pstmt.setDouble(8,debit);
            pstmt.setDouble(9,credit);
             pstmt.setDouble(10,amount);
            pstmt.setString(11,remarks);
            result=pstmt.executeUpdate();
        }
        catch (Exception e) {
            System.out.println("Error: "+e);
        }
            return result;
    }
      
      
       public int save_sales_history( String date,String party_name,String invoice_no,String payment_method,String sale_item,String quantity,double debit,double credit,double amount,String remarks)
    {
        int result=0;
        try {
            pstmt=conn.prepareStatement("insert into sales_history values(?,?,?,?,?,?,?,?,?,?,?)");
            pstmt.setInt(1,0);
            pstmt.setString(2,date);
            pstmt.setString(3,party_name);
            pstmt.setString(4,invoice_no);
             pstmt.setString(5,payment_method);
             pstmt.setString(6,sale_item);
            pstmt.setString(7,quantity);
            pstmt.setDouble(8,debit);
            pstmt.setDouble(9,credit);
             pstmt.setDouble(10,amount);
            pstmt.setString(11,remarks);
            result=pstmt.executeUpdate();
        }
        catch (Exception e) {
            System.out.println("Error: "+e);
        }
            return result;
    }
      
      
      
      
      
      
        public int delete_purchase_history()
    {        
     int result=0;
        try {
           
            pstmt=conn.prepareStatement("truncate table purchase_history");
            result=pstmt.executeUpdate();
        }
        catch (Exception e) {
            System.out.println("Error: "+e);
        }
            return result;
        
    }
        
        
          public int delete_sales_history()
    {        
     int result=0;
        try {
           
            pstmt=conn.prepareStatement("truncate table sales_history");
            result=pstmt.executeUpdate();
        }
        catch (Exception e) {
            System.out.println("Error: "+e);
        }
            return result;
        
    }
     
   
    
   
         
       
         
     
     }
            

         
         
