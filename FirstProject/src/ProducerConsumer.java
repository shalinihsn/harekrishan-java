import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProducerConsumer {
	
	private static LinkedList<Integer> sharedList=new LinkedList<>();
	int capacity=2;
	int val=0;
	
	void produceData() throws InterruptedException
	{
		while(true)
		{
			synchronized(this)
			{
				while(sharedList.size()==capacity)
				{
					wait();
				}
				System.out.println("data produced is "+val);
				sharedList.add(val++);
				//System.out.println("data produced is "+val);
				notify();
				Thread.sleep(1000);
			}
			
		}
		
	}
	
	void consumeData() throws InterruptedException
	{
		while(true)
		{
			synchronized(this)
			{
				while(sharedList.isEmpty())
				{
					wait();
				}
				int data=sharedList.removeFirst();
				System.out.println("data consumed is "+data);
				notify();
				Thread.sleep(1000);
			}
		}
	}

}
