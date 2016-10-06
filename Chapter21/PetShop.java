import javax.servlet.http.*;
import java.io.*;
import javax.servlet.*;
/*
 * Created on 20-Jun-2005
 *
 */

/**
 * @author Alistair
 *
 * All rights reserved by Alistair Rooney (c) 2005
 * Unless specifically waived under Open Source Agreement
 * 
 * 20-Jun-2005
 */
public class PetShop extends HttpServlet 
{
   public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>SAP Pet Shop</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Your Order has been Processed</h1><br><br>");
        out.println("Welcome "+ request.getParameter("FNAME")+ "<br>");
        out.println("You have chosen a "+ request.getParameter("PET"));
        out.println("</body>");
        out.println("</html>");
    }

   public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
      this.doPost(request, response);
    }
}
