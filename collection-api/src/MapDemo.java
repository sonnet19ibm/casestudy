import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> map=new HashMap<>();
		map.put("shakthi","parth");
		map.put("mine","theirs");
		map.put("hello","there");
		
	
		System.out.println("the set is"+ map.keySet());
		
		for(String key:map.keySet())
			System.out.println(key+":"+map.get(key));
		
//		System.out.println("shakthi"+map.get("shakthi"));
//		System.out.println("hello"+map.get("hello"));
		
		

	}

}
