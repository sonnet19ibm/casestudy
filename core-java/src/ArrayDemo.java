
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {16,10,19,5,25,3};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int temp=0;
				if (arr[j]<arr[i]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			
			int tem[]=System.out.println(arr[i]+"");
			System.out.println(tem[]);
		}
			//System.out.println(arr[i]);
		

	}

}
