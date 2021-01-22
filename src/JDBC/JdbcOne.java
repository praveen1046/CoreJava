package JDBC;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class JdbcOne {
	public static void main(String[] args) throws SQLException
	{
		Driver d = new OracleDriver();
		DriverManager.registerDriver(d);
		System.out.println("driver registerd");
		Connection co = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		Statement s = co.createStatement();
		co.close();
		System.out.println("connection is closed");
		
		
		
	}

}
