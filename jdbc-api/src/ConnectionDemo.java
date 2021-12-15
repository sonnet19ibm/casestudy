import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.DatabaseMetaData;
import com.mysql.cj.jdbc.Driver;

public class ConnectionDemo {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/ibm";
		Connection conn=null;
		
		try {
			DriverManager.registerDriver(new Driver());
			conn=DriverManager.getConnection(url,"Pravallika","tiger");
			System.out.println("connected successfully");
			
			java.sql.DatabaseMetaData meta=conn.getMetaData();
			System.out.println("DB name:"+ meta.getDatabaseProductName());
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
