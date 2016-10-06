/** 
 *
 * @author Alistair Rooney
 *
 * Basic Threads Example
 * (c) Alistair Rooney 2003 
 * 
 * 
 **/

class SimpleThread implements Runnable
{
    public void run()
    {
    // count from 1 to 10
        for(int i=1; i<11; i++)
        {
            System.out.println("i = "+i);
        }
    }
}




