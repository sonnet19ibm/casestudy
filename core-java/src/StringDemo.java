
public class StringDemo {

	public static void main(String[] args) {
		String s1="Hello";
		String s2=new String("Mem");
		String s3="Hello";
		// TODO Auto-generated method stub
				
	    System.out.println(s1);
	    System.out.println(s1.equals(s2));
	    
	    s1=s1+"world";
	    System.out.println(s1);
	    
	    System.out.println(s1.length());
	    System.out.println(s1.toLowerCase());
	    System.out.println(s1.indexOf('d'));
	    System.out.println(s1.substring(2,6));
	    

	}

}
