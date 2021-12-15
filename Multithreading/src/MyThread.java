
public class MyThread extends Thread{
	private int data;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name=Thread.currentThread().getName();
		for(int i=1;i<=50;i++) {
			System.out.println(name+":"+ ++data);
			
		}
	}
	public static void main(String[] args) {
		MyThread mt1=new MyThread();
		mt1.setName("first");
		
		MyThread mt2=new MyThread();
		mt2.setName("second");
		
		MyThread mt3=new MyThread();
		mt3.setName("third");
		
		mt1.setPriority(MIN_PRIORITY);
		mt3.setPriority(MAX_PRIORITY);
		
		
		mt1.start();
		mt2.start();
		mt3.start();
	}
	
	

}
