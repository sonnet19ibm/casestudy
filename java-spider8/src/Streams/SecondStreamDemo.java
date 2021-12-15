package Streams;

import java.util.Arrays;
import java.util.List;

public class SecondStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> basket=Arrays.asList("Cherry","Mango","guava");
		basket.forEach(System.out::println);
		basket.stream().sorted().forEach(System.out::println);
		basket.stream().map(s ->s.toUpperCase()).forEach(System.out::println);
		basket.stream().filter(s ->s.contains("a")).forEach(System.out::println);
		
		System.out.println(basket.stream().filter(s -> s.contains("a")).count());
		

	}

}
