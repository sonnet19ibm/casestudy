
public class Car {
	private String model;
	private String[] features;
	
	public Car(String model,String... features) {	//It can only be the last argument in the method 
		this.model=model;
		this.features=features;
	}
	
	public void specs() {
		System.out.println("Features of "+model);
		for(String f:features) {
			System.out.println(" - " + f);
		}
	}
	
	public static void main(String[] args) {
		Car alto = new Car("Suzuki","poerwe","airbags");//to pass string 
		alto.specs();
		
		Car astor =new Car("Astor","kyless","adas");
		astor.specs();
		
	}

}
