package thread_by_runnable_interface;

class Kitchen implements Runnable // Kitchen is a Process => process has multiple threads
{
	@Override
	public void run() 
	{
		System.out.println("Order taken by: "+Thread.currentThread().getName());
		prepareFood();
	}
	
	public static synchronized void prepareFood() // critical section
	{
		System.out.println("Food Prepration Started: "+Thread.currentThread().getName());
		try 
		{
			Thread.sleep(3000); // time taken to prepare food
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Food Prepration Done: "+Thread.currentThread().getName());
	}
}

public class Restaurant // driver code
{
	public static void main(String[] args) 
	{
		Thread t1=new Thread(new Kitchen(), "chef-1");
		t1.start();
		Thread t2=new Thread(new Kitchen(), "chef-2");
		t2.start();
		Thread t3=new Thread(new Kitchen(), "chef-3");
		t3.start();
	}
}
