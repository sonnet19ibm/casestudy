
public class DaemonThread extends Thread {
	private int limit;
	
	public DaemonThread(int limit,String name) {
		super(name);
		this.limit=limit;
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name= Thread.currentThread().getName();
		for(int c=1;c<=limit;c++)
			System.out.println(name+":"+c);
	}
	public static void main(String[] args) {
		DaemonThread d1=new DaemonThread(25,"First");
		DaemonThread d2=new DaemonThread(50,"Second");
		DaemonThread d3=new DaemonThread(75,"third");
		DaemonThread d4=new DaemonThread(50000,"Daemon");
		d4.setDaemon(true);
		
		d1.start();
		d2.start();
		d3.start();
		d4.start();
	}
}
