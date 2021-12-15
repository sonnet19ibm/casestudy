class EventImpl implements Event{
	public void doSomething() {
		System.out.println("Class level implementation");
	}
}




public class EventDemo {
	public static void main(String[] args) {
		EventImpl e1=new EventImpl();
		e1.doSomething();
		
		EventDemo ed=new EventDemo();
		InnerEventImpl e2=ed.new InnerEventImpl();
		
	}

}
