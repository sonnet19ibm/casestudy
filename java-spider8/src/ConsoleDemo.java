import java.util.Scanner;
import java.util.regex.Pattern;

public class ConsoleDemo {
	
	public static void main(String[] args) {
		
		Scanner console=new Scanner(System.in);
		
		System.out.println("Enter Name: ");
		
		String name=console.next();
		
		String nameRegex="[A-Z][a-z]{4,}";
		System.out.println(name.matches(nameRegex));
		System.out.println("Name: "+name);
		//for number
		
		
		
	}

}
