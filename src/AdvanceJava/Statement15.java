package AdvanceJava;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;

public class Statement15 {
	public static void main(String[] args) throws SQLException
	{
		Driver d = new OracleDriver();
		DriverManager.registerDriver(d);
		Connection c =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		Statement st = c.createStatement();
		st.executeQuery("create table mall(mallflors number,mallshooping varchar(10),mallfood number,mallbill number)");
		System.out.println("table created");
		ResultSet rs = st.executeQuery("select *from mall");
		System.out.println(rs);
		c.close();
	}
}
	