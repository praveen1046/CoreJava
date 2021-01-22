package JDBC;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;

import oracle.jdbc.connector.OracleConnectionManager;
import oracle.jdbc.driver.OracleDriver;

public class Jdbcdelete {
	public static void main(String[] args) throws SQLException
	{
		Driver d = new OracleDriver();
		DriverManager.registerDriver(d);
		System.out.println("register connection");
		Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		Statement s = c.createStatement();
		s.executeUpdate("Delete from Moviehall where seatnumber=15");
		ResultSet r = s.executeQuery("select * from Moviehall");
		System.out.println(r);
		c.close();
		System.out.println("connectiom closed");
	
		
	}
}
