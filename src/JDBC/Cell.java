package JDBC;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class Cell {
	public static void main(String[] args) throws SQLException
	{
		Driver d = new OracleDriver();
		DriverManager.registerDriver(d);
		System.out.println("Driver registered ");
		Connection co = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		Statement st = co.createStatement();
		System.out.println("statement created ");
		st.executeQuery("create table Cell(Cellname varchar(10),Cellcost number,Cellemid  number)");
		ResultSet rs = st.executeQuery("select *from Cell");
		System.out.println(rs);
		co.close();
	}
	
		
		
}
