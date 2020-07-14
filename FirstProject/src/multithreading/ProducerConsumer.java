package multithreading;

import java.util.Queue;

public class ProducerConsumer {
	
	
	
	public static void main(String[] args) throws InterruptedException
	{
		 int MAX_SIZE=10;
		final  Queue<Integer> queue=new java.util.LinkedList<Integer>();
		Producer p= new Producer(queue,MAX_SIZE);
		Consumer c= new Consumer(queue);
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
	
	class Producer implements Runnable
	{

		private Queue<Integer> queue;
		private int capacity;
		public Producer(Queue<Integer> queue2, int mAX_SIZE) {
				queue=queue2;
				capacity=mAX_SIZE;
				}
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName()+" started");
			int value=0;
		while(true)
		{
			
			synchronized(queue)
			{
				
				
		     
		    	 System.out.println("size of queue in producer is  "+queue.size());
					while(queue.size()==capacity)
					{
						
						try {
							queue.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
						
						queue.add(value);
						value++;
						
						System.out.println("Integer produced is  "+value);
						queue.notify();
						
						try {
							Thread.sleep(300);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}
					
			}
		}
			
		}
		
	
	
	class Consumer implements Runnable
	{
		private Queue<Integer> queue;

		public Consumer(Queue<Integer> queue2) {
			queue=queue2;
		}

		@Override
		public void run() {
			while(true)
			{
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			//System.out.println("consumer started");
			synchronized (queue) {
				System.out.println(Thread.currentThread().getName());
					while(queue.isEmpty())
					{
						try {
							queue.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
					Integer s =queue.remove();
					System.out.println("Integer consumed  "+s);
					queue.notify();
									}
				
			}
		}
		
	}

	


