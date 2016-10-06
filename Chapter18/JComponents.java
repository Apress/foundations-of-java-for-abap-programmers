/** 
 *
 /** 
 *
 * @author Alistair Rooney
 *
 * Simple Panel Example
 * (c) Alistair Rooney 2003 
 * 
 * 
 **/

 import javax.swing.*;
 import java.awt.*;
 
 
 
 public class JComponents extends JPanel 
 {
     JLabel label;
     JTextField text;
 	
    public JComponents()
    {
    setLayout(new BorderLayout());
    label = new JLabel("Please Enter the Code");
    text = new JTextField();
 		
    add(label, BorderLayout.WEST);
    add(text, BorderLayout.CENTER);
 		
    }
 }

