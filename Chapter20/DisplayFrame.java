import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.util.*;

/**
 * @author Alistair Rooney
 * @version 1.0
 * Copyright 2002 2003 All rights reserved
 *
 * Example program of uUsing the SAP Java Connector to display company codes
 */
public class DisplayFrame extends JFrame
{
   public DisplayFrame(Object[] [] data)
   {
      DisplayPanel panel = new DisplayPanel(data);
      setTitle("My Company SAP Company Codes");
      Toolkit tk = Toolkit.getDefaultToolkit();
      setIconImage(tk.createImage(DisplayFrame.class.getResource("MyIcon.gif")));

      addWindowListener(new WindowAdapter()
      {
         public void windowClosing(WindowEvent e)
        {
          System.exit(0);
        }
      }
      );
      getContentPane().add(panel);
      pack();
      setVisible(true);
   }

}
