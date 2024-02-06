package thread_by_thread_class;

class Kitchen extends Thread // Here Kitchen is process => process has many threads
{
	public Kitchen(String threadName)
	{
		super(threadName);
	}
	
	@Override
	public void run()
	{
		System.out.println("Order taken by: "+Thread.currentThread().getName());
		preparedFood();
	}
	
	public static synchronized void preparedFood() // critical section
	{
		System.out.println("Food Prepration Started: "+Thread.currentThread().getName());
		try 
		{
			Thread.sleep(3000); // time taken to prepare food
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println("Food Prepration Done: "+Thread.currentThread().getName());
	}
}

public class Restaurant 
{
	public static void main(String[] args) 
	{
		Kitchen t1=new Kitchen("chef-1");
		t1.start();
		Kitchen t2=new Kitchen("chef-2");
		t2.start();
		Kitchen t3=new Kitchen("chef-3");
		t3.start();	
	}
}
