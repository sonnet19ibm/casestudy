import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LamdaDemo {
	
	public static void print(Object obj) {
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		Consumer<String> c1=System.out::println;
		c1.accept("Hello");
		
		Consumer<String> c2= LamdaDemo::print;
		c2.accept("Hola");
		
		Supplier<String> s1=() -> "Adidas";
		System.out.println(s1.get());
		print(s1.get());
		
		Predicate<Integer> p1=(x) ->  x>=10;
		System.out.println(p1.test(10));
		
		
		BiPredicate<String, String> p3=(s,c) ->s.contains(c);
		System.out.println(p3.test("valli","i"));
		
		Function<Integer,Integer> f1=(x) ->x*x;
		System.out.println(f1.apply(5));
		
	
		
		
		
	}

}
 