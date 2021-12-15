import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream inFile=null;
		FileOutputStream outFile=null;
		try {
			inFile=new FileInputStream("C:\\testing\\valli");//22mb approximatly
			outFile=new FileOutputStream("C:\\testing\\valli1");
			System.out.println("copying file");
			int ch=0;
			long ms1=System.currentTimeMillis();
			while(true) {
				ch=inFile.read();// reading a byte from stream
				if(ch == -1) break;
				outFile.write(ch);
			}
			long ms2=System.currentTimeMillis();
			System.out.println("file copied successfully in "+(ms2-ms1)+"ms");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		 finally {
			 try {
				 inFile.close();
				 outFile.close();
			 }catch(Exception e) {
				 e.printStackTrace();
			 }
		 }

	}

}
