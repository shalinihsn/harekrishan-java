import java.io.IOException;

public class Operators {

	public static void main(String[] args) {

		int a,b;
		for(a=1,b=4;a<b;a++,b--)
		{
			System.out.println("a is "+a);
			System.out.println("b is "+b);
		}
		
		try
		{
			int krishan=5/0;
		}
		
		catch(Exception e)
		{
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Hare krishan");
		}
		
		System.out.println(-10%-3);
		
		Thread t= new Thread(new Runnable()
		{
			
		public void run()
		{
			System.out.println("HareKrishan");
		}
		});
		t.start();
		
		t.start();
	}

}
