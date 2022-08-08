package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JdbcDemo2 {
	public static void main(String[] args) throws Exception{
		// step 1- load the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//step 2- Establish Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud","root","Ak$030801");
		System.out.println(con);
		//step 3- Execute SQL Statement
		String sql = "Update users set Flag=? where uid=?";
		PreparedStatement stat = con.prepareStatement(sql);
		stat.setInt(1,2);
		stat.setInt(2, 3);
		int noofrowschanged = stat.executeUpdate();
		
		//step 4- Process result
		System.out.println("no of rows Updated:"+noofrowschanged);
	}//

}
