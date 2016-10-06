package servletPack;
import java.io.*;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstSAPServlet extends GenericServlet 
{
   public void service(ServletRequest req, ServletResponse res)
     throws ServletException, IOException 
   {
      res.setContentType("text/html");
      PrintWriter out = res.getWriter();

      out.println("<HTML>");
      out.println("<HEAD>");
      out.println("<TITLE>My First SAP Servlet</TITLE>");
      out.println("</HEAD>");
      out.println("<BODY>");
      out.println("<CENTER><H1>Hi ABAPers - Welcome to the future!</H1></CENTER>");
      out.println("</BODY>");
      out.println("</HTML>");


      out.close();
   }

}


