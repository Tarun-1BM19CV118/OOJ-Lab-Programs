/*Write a program which creates two threads, one thread displaying BMS College of Engineering once every ten seconds and another 
displaying CSE once every two seconds.*/

class NewThread implements Runnable
{ Thread t;
   NewThread()
   {
     t=new Thread(this, "NThread");
	 t.start();
   }
   
  public void run()
   {
	   try
	   {
		   for(int n=1;n>0;n++)
		   {
			 System.out.println("BMS College of Engineering");
			 Thread.sleep(10000);
		   }
	   }
	   catch(InterruptedException ie)
	   {
		   System.out.println("Thread 1 Interrupted");
	   }
   }
}

class Thread2
{
	public static void main(String args[])
	{
		NewThread n1=new NewThread();
		try
		{
			for(int n=1;n>0;n++)
			{
				System.out.println("CSE");
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println("Thread2 interrupted");
		}
	}
}
