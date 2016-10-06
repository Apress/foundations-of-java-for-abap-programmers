class Counter
 {
     private int countVar;
 
     public synchronized int getCount() 
     {
         return countVar;
     }
 	
     public synchronized void incCount()
     {
         countVar+=1;
     }
 }








