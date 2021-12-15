
public class BasicsDemo {

	public static void main(String[] args) {
		/*for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}*/
		// TODO Auto-generated method stub
		int total=0;
		for(String s:args) {
			total+=Integer.parseInt(s);
		}
		System.out.println("total :"+ total);

	}

}
