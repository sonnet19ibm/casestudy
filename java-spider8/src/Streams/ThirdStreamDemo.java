package Streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ThirdStreamDemo {
	public static void main(String[] args) {
		
		Map<String,String> people=new HashMap<>();
		people.put("pollo", "pune");
		people.put("anantapur", "hyd");
		
		people.values().forEach(System.out::println);
		
		List<String> cities=people.values().stream().sorted().collect(Collectors.toList());
		cities.forEach(System.out::println);
		
		Map<String, List<String>> contacts=new HashMap<String,List<String>>();
		contacts.put("Frudo", Arrays.asList("892-108","731-8912"));
		contacts.put("jack", Arrays.asList("1234-4523","3423-8978"));
		contacts.put("Sam", Arrays.asList("2344-5678","9998-8800","6666-7777"));
		
		contacts.values().stream().flatMap(Collection::stream).forEach(System.out::println);
		
		//sort and collect contacts map values into a list  and print
		
		
	}

}
