import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q=new LinkedList<>();
		for(int i=0;i<5;i++) 
			q.add(i);
			
		System.out.println("Display elements"+q);
		
		Queue<String> p=new PriorityQueue<>();
		p.add("news");
		p.add("is the ");
		p.add("thing");
		
		System.out.println(p);
		
		Queue<String> qp=new LinkedList<>();
		qp.add("apple");
		qp.offer("Banana");
		qp.offer("cherry");
		
		System.out.println(qp.peek());//Printing the top element
		
		while(!qp.isEmpty())
			System.out.println(qp.poll());//printing and removing it from container
		

	}

}
