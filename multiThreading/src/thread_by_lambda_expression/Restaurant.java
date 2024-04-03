package thread_by_lambda_expression;

class Kitchen // Kitchen is a process => process has many threads
{
	public static synchronized void prepareFood() // critical section
	{
		System.out.println("Food Preparation Stared: "+Thread.currentThread().getName());
		try
		{ 
			Thread.sleep(3000); // time taken to prepare food
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Foor preparation Done: "+Thread.currentThread().getName());
	}
}

public class Restaurant  // driver code
{
	public static void main(String[] args) 
	{
		Thread t1=new Thread( new Runnable() {
			@Override
			public void run()
			{
				System.out.println("Order taken by: "+Thread.currentThread().getName());
				Kitchen.prepareFood();
			}
		}, "chef-4" );
		
		
		
		Thread t2=new Thread( ()->{
			System.out.println("Order taken by: "+Thread.currentThread().getName());
			Kitchen.prepareFood();
		}, "chef-2" );
		
		
		Thread t3=new Thread( ()->{
			System.out.println("Order taken by: "+Thread.currentThread().getName());
			Kitchen.prepareFood();
		}, "chef-3" );
		
		
		Thread t4=new Thread( ()->{
			System.out.println("Order taken by: "+Thread.currentThread().getName());
			Kitchen.prepareFood();
		}, "chef-1" );
		
		
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
}
