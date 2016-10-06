import java.sql.*;

public class InsertUser
{
       public static void main(String args[])
       {
           Connection myCon;
           try
           {
              Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              }
                 catch (Exception ex)
              {
                 System.err.println("No DRIVER loaded! "+ ex);
                 return;
              }
              try
              {
                 String theURL = "jdbc:odbc:MiniClinic";
                 myCon = DriverManager.getConnection(theURL," ", " ");
              }
              catch (Exception e)
              {
                 System.err.println("No CONNECTION dude! "+ e);
                 return;
              }
		
              try
              {
                 Statement myStmt = myCon.createStatement();
                 ResultSet rs = myStmt.executeQuery("SELECT * FROM USER");
		
                 while(rs.next())
                 {
                    int acode = rs.getInt("aCode");
                    String userName = rs.getString("userName");
                    int passw = rs.getInt("password");
                    System.out.println("User is: "+acode+" "+userName+" "+passw);
                 }	
              }
              catch (Exception es)
              {
                 System.err.println("SQL Problem! "+ es);
              }
              finally
              {
                 try
                 {
                    myCon.close();
                    return;
                 }
                 catch(Exception e)
                 {}
              }
       }
}
