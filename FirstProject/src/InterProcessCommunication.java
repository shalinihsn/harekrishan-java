
public class InterProcessCommunication {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	final	ProducerConsumer pc = new ProducerConsumer();
	System.out.println("hare krishan");
		Thread t1 = new Thread( new Runnable() {
			
			@Override
			public void run() {
					try {
						pc.produceData();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}				
			}
		});
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					pc.consumeData();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
				
		t1.start();
		t2.start();
		t1.join();
		t2.join();

	}

}
