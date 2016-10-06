/**
 * @(#)JavaBookExcept.java 1.1 07/15/05
 *
 * @author Alistair Rooney
 *
 * Basic Exception Handling Example
 * (c) Alistair Rooney 2005
 *
 * You may use this code, copy this code, sell this code,
 * print this code out and wallpaper your house with it
 * if you wish.
 **/

import java.io.*;

class JavaBookExcept
{
    public static void main(String args[]) 
    {
       char castChar = ' ';
       System.out.println("Starting JavaBookExcept...");
       try
       {
         System.out.print("Please enter the letter 'a' : ");
         while (castChar != 'a')
         {
            castChar = (char)System.in.read();
         }
         System.out.println("\nWell Done, you typed "+castChar);
      }
      catch (IOException e)
      {
         System.err.println("\nAn Error was encountered :"+e);
      }
   }
}




