import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class StatementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sql="insert into product values(231,'apple',2500)";
		
		try {
			Connection conn=JdbcUtil.getConnection();
			java.sql.Statement stmt= conn.createStatement();
			((java.sql.Statement) stmt).executeUpdate(sql);
			System.out.println("record inserted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
