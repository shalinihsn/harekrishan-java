package filesio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultithreadReading {
	
	public static void readFileData(File f,ExecutorService es)
	{
		/*
		 * if(f.isDirectory()) { readFileData(f, es); } else {
		 */
			for(File f2 :f.listFiles())
			{
			es.execute(new Runnable() {
				
				@Override
				public void run() {
					synchronized(this)
					{BufferedReader br=null;
					System.out.println("filename  "+f2.getName()+"  is accessed by "+Thread.currentThread().getName());

					try {
						 br = new BufferedReader(new FileReader(f2));
						String s=null;
						while(( s = br.readLine())!=null)
						{
						   System.out.println(s);	
						}
						
						System.out.println("end of file "+f2.getName());
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					finally
					{
						try {
							br.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				}
			});
			}
		/* } */
	}

	public static void main(String[] args) {
		
		Instant start=Instant.now();
		ExecutorService es = Executors.newFixedThreadPool(3);
		File f = new File("F:\\readfiles");
		f.mkdir();
		
		readFileData(f,es);
       Instant end=Instant.now();
       long timeElapsed= Duration.between(start, end).toMillis();
       System.out.println("time elapsed "+timeElapsed);
	}

}
