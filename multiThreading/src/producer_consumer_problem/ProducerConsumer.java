package producer_consumer_problem;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer 
{
	public static void main(String[] args) 
	{
		Object key=new Object();
		Queue<Integer> queue=new LinkedList<>(); // common buffer
		int plateSize=10;
		
		// producer thread
		Thread producer=new Thread(new Runnable() {
			@Override
			public void run() 
			{
				int counter=0;
				while(true)
				{
					synchronized(key) 
					{
						try 
						{
							while(queue.size()==plateSize)
								key.wait(); // red signal
							
							queue.offer(counter++);
							Thread.sleep(1000); // time required to produced MOMO
							System.out.println("MOMO produced, plate size: "+queue.size());
							key.notify(); // green signal
						} 
						catch (Exception e) 
						{
							e.printStackTrace();
						}
					}
				}	
			}	
		}, "producer-thread");
		
		
		
		// consumer thread
		Thread consumer=new Thread(()->{
			// task for thread
			while(true)
			{
				synchronized(key) 
				{
					try 
					{
						while(queue.size()==0)
							key.wait(); // red signal
						queue.poll();
						
						Thread.sleep(800); // time required to consume MOMO
						System.out.println("MOMO consumed, plate size: "+queue.size());
						key.notify(); // green signal
					} 
					catch (Exception e) 
					{
						e.printStackTrace();
					}
					
				}	
			}
			
		}, "consumer-thread");
		
		producer.start();
		consumer.start();
	}
}
