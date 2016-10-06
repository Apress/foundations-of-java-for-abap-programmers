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
public class ContentHandling implements ContentHandler 
{
   private Locator loc;

   public void setDocumentLocator(Locator locator)
   {
      this.loc = locator;
   }
   public void startDocument()throws SAXException
   {
     System.out.println("Parsing is Starting");
   }
   public void endDocument()throws SAXException
   {
      System.out.println("Parsing complete");
   }
   public void processingInstruction(String target, String data)throws SAXException
   {
      System.out.println("PI: Target="+target+" and Data="+data);
   }
   public void startElement(String nmsURI, String localName, 
                String qName, Attributes atts)
   {
      System.out.println("Start Element: Local Name="+localName);
      for(int i=0; i<atts.getLength(); i++)
      {
        System.out.println("Element has the attribute "+atts.getLocalName(i)+" Value is "+atts.getValue(i));
      }
   }
   public void endElement(String nmsURI, String localName, String qName)throws SAXException
   {
      System.out.println("End Element: Local Name="+localName);
   }
   public void characters(char[] ch, int start, int length)throws SAXException
   {
      String s = new String(ch, start, length);
      System.out.println("Characters="+s);
   }
   public void ignorableWhitespace(char[] ch, int start, int length)
   {
   // No implementation yet!
   }
   public void skippedEntity(String name)
   {
      System.out.println("Skipped Entity"+name);
   }
   public void startPrefixMapping(String prefix, String uri)
   {
   
   }
   public void endPrefixMapping(String prefix)
   {
    
   }
}
