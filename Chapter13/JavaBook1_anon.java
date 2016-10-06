/*
 *  Simple Anonymous Class example
 */
 
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

class JavaBook1 extends Applet 
{
    Button press = new Button("Click here!");

    public void init()
    {
        add(press);
        press.addActionListener(new  ActionListener()
             {
                public void actionPerformed(ActionEvent ae)
                {
                    System.out.println("The Button was pressed");
                }
            }
        );
    }
}



