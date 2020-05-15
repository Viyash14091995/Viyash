package com.adactincucumber.baseclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String url = "jdbc:mysql://localhost:3307/busbooking";
		String user = "root";
		String password = "root";
		String sql="select * from booking";

		Class.forName("com.mysql.jdbc.Driver");
		Connection Connect = DriverManager.getConnection(url, user, password);
		Statement createStatement = Connect.createStatement();
		ResultSet executeQuery = createStatement.executeQuery(sql);
		
		while (executeQuery.next()) {
			System.out.println(executeQuery.getString(1)+  "     ");
			System.out.println(executeQuery.getString(2));
			
			
		}
	}

}
