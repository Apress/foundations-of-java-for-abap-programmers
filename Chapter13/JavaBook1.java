/*
 *  Simple Inner Class example
 */
 
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

class JavaBook1 extends Applet 
{
    Button press = new Button("Click here!");

    public void init()
    {
        class InnerClassExample implements ActionListener
        {
            public void ActionPerformed(ActionEvent ae)
            {
                System.out.println("The Button was pressed");
            }
        }
        add(press);
        press.addActionListener(new InnerClassExample());
    }

}


