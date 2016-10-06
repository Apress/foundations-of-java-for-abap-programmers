/** 
 *
 * @author Alistair Rooney
 *
 * Basic Threads Example
 * (c) Alistair Rooney 2003 
 * 
 * 
 **/

class SimpleThread extends Thread
{
    int from;
    int to;

    SimpleThread(int from,int to)
    {
 	this.from = from;
	this.to = to;
    }

 public void run()
    {
        System.out.println("Thread"+getName()+"Started");
        // count from 1 to 10 * Thread number
        for(int i=from; i<to+1; i++)
        {
            System.out.println("Thread "+getName()+"i = "+i);
        }
        yield();
    }
}







