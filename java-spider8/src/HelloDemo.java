
public class HelloDemo {
	
	public static void main(String[] args) {
		
		Hello h=() ->"Hello World";
		System.out.println(h.sayHello());
		
		Hello h2=() ->{
			String msg="Holla";
			return msg;
		};
		
		
		System.out.println(h2.sayHello());
		
		Hello.greet();
		
		
		
		
	}

}
