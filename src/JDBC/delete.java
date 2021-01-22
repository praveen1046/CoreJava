package JDBC;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class delete {
	
	public static void main(String[] args) throws SQLException {
		
		Driver d = new OracleDriver();
		DriverManager.registerDriver(d);
		System.out.println("driver registered");
		Connection co = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		System.out.println("connection is connected");
		Statement s = co.createStatement();
		s.executeUpdate("Delete from laptop where laptopid=162 ");	
		System.out.println("table deleted");
		ResultSet rs = s.executeQuery("select *from laptop");
		co.close();
		
			
	}
}
