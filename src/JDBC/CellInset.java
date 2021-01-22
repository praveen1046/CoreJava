package JDBC;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class CellInset {
	public static void main(String[] args) throws SQLException
	{
		Driver D = new OracleDriver();
		DriverManager.registerDriver(D);
		System.out.println("driver registered ");
		Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		Statement st = c.createStatement();
		st.executeUpdate("insert into Cell values('realme',8999,1520)");
		c.close();
		System.out.println("connection closed");
		
		
	}
}

