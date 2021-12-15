import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sql="insert into product values(?,?,?)";// known as place holders
		
		try {
			Connection conn=JdbcUtil.getConnection();
			PreparedStatement  stmt=conn.prepareStatement(sql);
			
			stmt.setInt(1,Integer.parseInt(args[0]));//1,151
			stmt.setString(2, args[1]);//2,"iphone"
			stmt.setDouble(3, Double.parseDouble(sql));//3,50000
			
			stmt.executeUpdate();// performing dml operations
			System.out.println("Record inserted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
