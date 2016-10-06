import javax.swing.*;
//import java.awt.event.ActionListener;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 * @author Alistair Rooney
 * 
 * Panel to contain the load button and JTable to
 * view the SAP company codes.
 * 
 * All rights reserved (c) 2002 2003
 */
public class DisplayPanel extends JPanel
{
   JTable table;
   Vector names;

   public DisplayPanel(Object [] [] data)
   {
      Object[] names = {"Code","Description"};
      table = new JTable(data, names);
      // add to table.
      TableColumn column = null;
      for (int i = 0; i < 2; i++) 
      {
        column = table.getColumnModel().getColumn(i);
        if (i == 0) 
        {
        // "Company codes" is small
          column.setPreferredWidth(40); 
        } 
        else 
        {
          column.setPreferredWidth(200);
        }
}


        JScrollPane scrollPane = new JScrollPane(table);
        table.setPreferredScrollableViewportSize(new Dimension(240, 300));
        add(scrollPane);
   }

}

