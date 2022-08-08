package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcDemo3 {
	public static void main(String[] args) throws Exception{
		// step 1- load the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//step 2- Establish Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud","root","Ak$030801");
		System.out.println(con);
		//step 3- Execute SQL Statement
		String sql = "Update users set Flag=? where uid=?";
		PreparedStatement stat = con.prepareStatement(sql);
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the UID NO:");
			int uid= scan.nextInt();
			System.out.println("Enter the Flag Value:");
			int flag= scan.nextInt();
		stat.setInt(1,flag);
		stat.setInt(2, uid);
		int noofrowschanged = stat.executeUpdate();
		//
		//step 4- Process result
		System.out.println("no of rows Updated:"+noofrowschanged);
	}
	}
}
