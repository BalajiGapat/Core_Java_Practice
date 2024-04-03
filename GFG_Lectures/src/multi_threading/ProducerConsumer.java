package multi_threading;

import java.util.ArrayDeque;
import java.util.Queue;

public class ProducerConsumer 
{
	public static void main(String[] args)
	{
		Queue<Integer> buffer=new ArrayDeque<>();
		int plateSize=5;
		Object key=new Object();
		Thread producer=new Thread( ()->{
			
			
			int counter=0;
			// task for thread
			while(true)
			{
				synchronized (key) 
				{
					try
					{
						if(plateSize==buffer.size())
							key.wait(); // red signal
						buffer.offer(counter++);
						//Thread.sleep(1000); // time take to produced Momos
						System.out.println("Momos produced: "+buffer.size());
						key.notify(); // red signal
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				}
			}
			
		}, "producer");
		
		Thread consumer=new Thread( new Runnable(){
			@Override
			public void run()
			{
				while(true)
				{
					synchronized (key) 
					{
						try
						{
							if(buffer.isEmpty())
								key.wait(); // red signal
							
							buffer.poll();
							//Thread.sleep(1000);
							System.out.println("Momos consumed: "+buffer.size());
							key.notify(); // green signal
						}
						catch(Exception e)
						{
							e.printStackTrace();
						}
					}
				}
			}
		}, "consumer");
		
		
		producer.start();
		consumer.start();
	}
}
