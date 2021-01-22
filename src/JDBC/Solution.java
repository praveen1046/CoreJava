package JDBC;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class Solution {
	public static void main(String[] args) throws SQLException
	{
		Driver d = new OracleDriver();
		DriverManager.registerDriver(d);
		System.out.println("driver register succeesfully");
		Connection co =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		Statement st = co.createStatement();
		st.executeQuery("create table Book(bookcost number,bookid number ,bookauthor varchar(20))");
		ResultSet rs = st.executeQuery("select *from Book");
		System.out.println(rs);
		co.close();
		
	}

}
