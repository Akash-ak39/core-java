package demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Jdbc_1 {
	public static void main(String[] args) throws Exception{
		// step 1- load the Driver
				Class.forName("com.mysql.cj.jdbc");
				//step 2- Establish Connection
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud","root","Ak030801");
				System.out.println(con);
	}

}
