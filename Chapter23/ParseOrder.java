package arcParsing;

/**
 * @author Alistair
 *
 * All rights reserved by Alistair Rooney (c) 2005
 * Unless specifically waived under Open Source Agreement
 * 
 * 09-Aug-2005
 */
import org.xml.sax.*;
import java.io.*;
import org.apache.xerces.parsers.*;
public class parseOrder 
{

    public static void main(String[] args) 
    {
       parseOrder po = new parseOrder();
       po.startP("C:\\order.xml");
    }
    public void startP(String xmlFile)
    {
       ContentHandler cont = new ContentHandling();
       try
       {
          XMLReader mySAX = new SAXParser();
          mySAX.setContentHandler(cont);
          mySAX.parse(xmlFile);
       }
       catch (IOException ioe)
       {
          System.out.println("IO Exception "+ioe.getMessage());
       }
       catch (SAXException se)
       {
          System.out.println("A SAX Exception has occurred "+se.getMessage());
       }

    }
}
