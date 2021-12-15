import java.util.Comparator;
import java.util.TreeSet;

public class SortedPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Comparator <Person> pc=(p1,p2)-> p1.getAge()-p2.getAge();
		Comparator<Person> pc3=(p1,p2)-> p1.getName().compareTo(p2.getName());
		
		TreeSet<Person> people=new TreeSet<Person>(pc3);//pc
		people.add(new Person("shakthi",21));
		people.add(new Person("sunny",14));
		
		
		for(Person p:people)
			System.out.println(p);

	}

}
