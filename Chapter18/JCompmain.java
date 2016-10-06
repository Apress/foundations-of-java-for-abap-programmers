/** 
 *
 * @author Alistair Rooney
 *
 * Very Simple Swing Example
 * (c) Alistair Rooney 2003 
 * 
 * 
 **/

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


class JCompmain extends JFrame 
{

    public static void main(String args[]) 
    {
        JComponents myPanel = new JComponents();
        JCompmain mainFrame = new JCompmain();
        mainFrame.setSize(200, 200);
        mainFrame.addWindowListener(new WindowAdapter()
           {
             public void windowClosing(WindowEvent e)
             {
                System.exit(0);
             }
       	    }
           );
        mainFrame.getContentPane().add(myPanel, BorderLayout.NORTH);
        mainFrame.setTitle("JComponents");
        mainFrame.setVisible(true);
        }
}
