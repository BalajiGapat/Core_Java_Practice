package multi_threading;

class Kitchen // kitchen is process => process have multiple threads
{
	public void prepareFood()
	{
		System.out.println("Order taken by: "+Thread.currentThread().getName());
		
		synchronized (this)  // Critical Section i.e Oven
		{
			System.out.println("Food prepration started By: "+Thread.currentThread().getName());
			try
			{
				Thread.sleep(2000); // time taken to prepare food
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			
			System.out.println("Food preperation Done By: "+Thread.currentThread().getName());
		
		}
	}
}


public class Restaurant  // Driver class
{
	public static void main(String[] args) 
	{
		Kitchen kn=new Kitchen();
		
		Thread t1=new Thread( ()->{
			kn.prepareFood();
		}, "chef-1" );
		
		Thread t2=new Thread( new Runnable() {
			@Override
			public void run()
			{
				kn.prepareFood();
			}
		}, "chef-2");
		
		Thread t3=new Thread( ()->{
			kn.prepareFood();
		}, "chef-3");
		
		Thread t4=new Thread( new Runnable() {
			@Override
			public void run()
			{
				kn.prepareFood();
			}
		}, "chef-4");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
