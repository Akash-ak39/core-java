package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class JDBC {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anoud", "root", "Ak$030801");
		System.out.println(con);
//		String str= "{call pro1(?)}";
//		CallableStatement cs= con.prepareCall(str);
//		cs.registerOutParameter(1,Types.INTEGER);
//		cs.execute();
//		int countcolumns=cs.getInt(1);
//		System.out.println("No of columns..:"+countcolumns);
		//callable statement
//		String sql= "{call pro2(?,?)}";
//		CallableStatement cs= con.prepareCall(sql);
//		cs.setString(1,"akash");
//		cs.setInt(2, 3);
//		int noofchanges = cs.executeUpdate();
//		System.out.println("no of changes..:"+noofchanges);
		
		String sql ="{call pro3(?,?)}";
		CallableStatement cs= con.prepareCall(sql);
		cs.setString(1,"akash");
		cs.registerOutParameter(2, Types.INTEGER);
		cs.execute();
		int flag = cs.getInt(2);
		System.out.println("Flag status..:"+flag);
	}

}
