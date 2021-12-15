
public class ThreadControl extends Thread {
	public ThreadControl(String name) {
		super(name);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name=Thread.currentThread().getName();
		while(true) {
			System.out.println(name);
			//yeild();
			
			//try {
			//	Thread.sleep(1);
			//}catch(InterruptedException e) {}
		}
	}
	
	public static void main(String[] args) {
		Thread t1=new ThreadControl("Hello");
		Thread t2=new ThreadControl("world");
		
		t1.start();
		t2.start();
	}
	

}
