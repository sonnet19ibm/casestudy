import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="C:\\testing\\test1.txt ";
		BufferedWriter writer =null;
		
		try {
			writer=new BufferedWriter(new FileWriter(path,true));
			writer.write("when i see you");
			writer.newLine();
			writer.write("hey how r u?");
			writer.newLine();
			System.out.println("writting to file completed");	
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			try {
				if(writer!=null)
					writer.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
