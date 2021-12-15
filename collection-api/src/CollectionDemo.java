import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionDemo {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("apple");
		list.add("ibm");
		
		System.out.println("--Traversing over arraylist using for loop");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("--Traversing over arraylist using iterator");
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("--traversing using for each loop");	
		for(String s:list)
			System.out.println(s);
		
		
		LinkedList<String> link=new LinkedList<String>();
		link.add("Tesla");
		link.addFirst("mercedes");
		link.add("audi");
		link.addLast("Meta");
		
		link.addAll(link); //merging linked list to array list
		System.out.println("--travesring over updated arraylist using for..each ");
		for(String s:list)
			System.out.println(s);
		//convert arraylist to hashset
		HashSet<String> set=new HashSet<String>(list);
		
	}

}
