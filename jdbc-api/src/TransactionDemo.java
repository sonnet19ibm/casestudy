import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sql1="insert into product values(123,'book',4000)";
		String sql2="update product set price=50000 where code=421";
		String sql3="delete from product where code=1";
		Connection conn=null;
		
		try {
			conn=JdbcUtil.getConnection();
			conn.setAutoCommit(false);
			
			Statement stmt=conn.createStatement();
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			
			stmt.executeBatch();
			conn.commit();
			
			System.out.println("transaction successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("transaction failed");
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}

}
