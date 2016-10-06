/*
 * 3-Tier Java example (NOT the Full program!)
 *
 *
 */

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
/**
 *
 * @author Alistair Rooney
 */
 public class GuestReservation extends HttpServlet
 {
     private Statement myStat = null;
     private Connection myCon = null;
 
     public void init(ServletConfig config) throws ServletException
     {
         super.init(config);
         try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String myURL = "jdbc:odbc:Guest";
            myCon = DriverManager.getConnection(myURL, "","");
        }
       catch(Exception e)
       {
          e.printStackTrace();
         System.err.println("ERROR: Cannot create a Connection");
         myCon = null;
       }
 }
 
 public void doPost(HttpServletRequest req, HttpServletResponse res)
 						       throws ServletException, IOException
 ….
 ….

 ….. . .
 //code snipped out which that will call submitData, handle HTML, etc. 
 ….. . .

 ….
 ….
       private boolean submitData(String guestData)
       {
           try
           {
             myStat = myCon.createStatement();
             myStat.execute("INSERT INTO registration (FirstName, LastName, Salutation, email, "+
                             "RoomType) VALUES ("+ guestData +");");
             myStat.close();
             return true;
           }
           catch(Exception ex)
           {
              System.err.println("ERROR: Cannot enter guest into database");
              ex.printStackTrace();
              return false;
           }
       }
 	
       public void destroy()
       {
           try 
           {
              myCon.close();
           }
           catch(Exception ex)
           {
               System.err.println("ERROR: Cannot CLOSE database");
           }
        }
 	
 }


