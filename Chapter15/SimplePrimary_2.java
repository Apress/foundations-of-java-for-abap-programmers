/** 
 *
 * @author Alistair Rooney
 *
 * Basic Threads Example
 * (c) Alistair Rooney 2003 
 * 
 * 
 **/

 class SimplePrimary
{
    public static void main(String args[])
    {
       SimpleThread t = new SimpleThread();
       new Thread(t).start();
       // count from 1 to 10 again
       for(int x=1; x<11; x++)
       {
          System.out.println("x = "+x);
       }
    }
}






