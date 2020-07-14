package multithreading;

import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumerLocks {


	
	
	
	public static void main(String[] args) throws InterruptedException
	{
		 int MAX_SIZE=10;
		final  Queue<Integer> queue=new java.util.LinkedList<Integer>();
		Lock lock = new ReentrantLock();
		Condition condition= lock.newCondition();
		ProducerLock p= new ProducerLock(queue,MAX_SIZE,lock,condition);
		ConsumerLock c= new ConsumerLock(queue, lock,condition);
		Thread producer= new Thread(p);
		producer.setName("producer");
		Thread consumer= new Thread(c);
		consumer.setName("consumer");
		producer.start();
		consumer.start();
		producer.join();
		consumer.join();
		System.out.println("main finished");
		
	}
}
	
	class ProducerLock implements Runnable
	{

		private Queue<Integer> queue;
		private int capacity;
		private Lock lock;
		private Condition condition;
		
		public ProducerLock(Queue<Integer> queue2, int mAX_SIZE,Lock lock, Condition condition) {
				this.queue=queue2;
				this.capacity=mAX_SIZE;
				this.lock=lock;
				this.condition=condition;
				}

		
		@Override
		public void run() 
		{
			System.out.println(Thread.currentThread().getName()+" started");
			int value=0;
		while(true)
		{
			
			try
			{
				lock.lock();
			
			
			
				
				
		     
		    	 System.out.println("size of queue in producer is  "+queue.size());
					while(queue.size()==capacity)
					{
						
						try {
							condition.await();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
						
						queue.add(value);
						value++;
						
						System.out.println("Integer produced is  "+value);
						condition.signal();
						
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}
			finally
			{
				lock.unlock();
			}
					
			}
		
		}
		
		}
		
	
	
	class ConsumerLock implements Runnable
	{
		private Queue<Integer> queue;
		private Lock lock;
		Condition condition;

		public ConsumerLock(Queue<Integer> queue2, Lock lock, Condition condition2) {
			queue=queue2;
			this.lock=lock;
			this.condition=condition2;
		}

		@Override
		public void run() {
			while(true)
			{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			//System.out.println("consumer started");
				try
				{
			       lock.lock(); 
				   System.out.println(Thread.currentThread().getName());
					while(queue.isEmpty())
					{
						try {
							condition.await();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
					Integer s =queue.remove();
					System.out.println("Integer consumed  "+s);
					condition.signal();
				}
				finally
				{
					lock.unlock();
				}
				
			}
		}
		
	}

	




