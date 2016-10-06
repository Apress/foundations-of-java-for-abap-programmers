/** 
 *
 * @author Alistair Rooney
 *
 * Very Simple Swing Example
 * (c) Alistair Rooney 2005 
 * 
 * 
 **/

import javax.swing.*;


class SimpleSwing extends JFrame 
{

public static void main(String args[]) 
   {
      SimplePanel myPanel = new SimplePanel();
      SimpleSwing mainFrame = new SimpleSwing();
      mainFrame.setSize(200, 200);
      mainFrame.getContentPane().add(myPanel);
      mainFrame.setTitle("SimpleSwing");
      mainFrame.setVisible(true);
   }
}










