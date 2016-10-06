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
 import java.awt.event.*;
 
public class SimplePanel extends JPanel implements ActionListener
 {
        JButton button1;
        JButton button2;
 
        public SimplePanel()
        {
            button1 = new JButton("Blue");
            button2 = new JButton("Red");
 
            add(button1);
            add(button2);
 
            button1.addActionListener(this);
            button2.addActionListener(this);
        }
 
        public void actionPerformed(ActionEvent ae)
        {
            Object button = ae.getSource();
            Color color = getBackground();
            if (button == button1)
            {
                color = Color.blue;
            }
            if (button == button2)
            {
                color = Color.red;
            }
            setBackground(color);
            repaint();
        }
 }











