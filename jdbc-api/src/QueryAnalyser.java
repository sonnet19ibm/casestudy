import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class QueryAnalyser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sql="select code,price from product";
		
		Connection conn=JdbcUtil.getConnection();
		ResultSet rs=conn.createStatement().executeQuery(sql);
		ResultSetMetaData meta=rs.getMetaData();
		
		for(int c=1;c<=meta.getColumnCount();c++)
			System.out.println(meta.getColumnName(c).toUpperCase()+"\t");
		System.out.println();
		
		while(rs.next()) {
			for(int c=1;c<=meta.getColumnCount();c++)
				System.out.println(rs.getString(c)+"\t");
			System.out.println();
		}
	}
}
