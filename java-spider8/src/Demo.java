/*
public class Demo {
	private Object data;
	//using fields
	public Demo(Object data) {
		this.data = data;
	}
	//getters and setters
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	//main method
	public static void main(String[] args) {
		Demo d1=new Demo("Hello");
		d1.setData(12.50);
		System.out.println(d1.getData());
		
		Demo d2=new Demo(100);
		System.out.println(d2.getData());	
	}
}*/

public class Demo<P>{
	private P data;
	//using fields
	public Demo(P data) {
		this.data = data;
	}
	//getters and setters
	public P getData() {
		return data;
	}
	public void setData(P data) {
		this.data = data;
	}
	//main method
	public static void main(String[] args) {
		Demo<String> d1=new Demo<String>("Hello");
		System.out.println(d1.getData());
	}
	
}
