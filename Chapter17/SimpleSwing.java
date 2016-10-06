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


class SimpleSwing extends JFrame 
{

    public static void main(String args[]) 
    {
        SimplePanel myPanel = new SimplePanel();
        SimpleSwing mainFrame = new SimpleSwing();
        mainFrame.setSize(200, 200);
        mainFrame.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        }
        );
        mainFrame.getContentPane().add(myPanel);
        mainFrame.setTitle("SimpleSwing");
        mainFrame.setVisible(true);
    }
}











