package com.alistairrooney.ejb;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.ejb.EJB;

public class HelloServlet extends GenericServlet 
{
  private HelloLocal hello;

  @EJB(name="HelloBean")
  public void setHello(HelloLocal hello)
  {
    this.hello = hello;
  }

  public void service(HttpServletRequest req, HttpServletResponse res)
    throws IOException, ServletException
  {
    PrintWriter out = res.getWriter();
    if (hello == null) 
    {
      out.println("This example requires JDK 1.5");
      return;
    }

    out.println(hello.shoutOut());
  }
}

