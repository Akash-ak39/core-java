package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo4 {
	public static void main(String[] args) throws Exception{
		// step 1- load the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//step 2- Establish Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud","root","Ak$030801");
		System.out.println(con);
		//step 3- Execute SQL Statement
		String sql = "select * from users where uname=?";
		PreparedStatement stat = con.prepareStatement(sql);
		stat.setString(1,"surey");
		ResultSet rs = stat.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+":"+rs.getString("uname")+":"+rs.getInt("amt"));
		}
	}

}//
