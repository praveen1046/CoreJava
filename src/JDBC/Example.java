package JDBC;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class Example {
	
		public static void main(String[] args) throws SQLException
		{
			Driver  d = new OracleDriver();
			DriverManager.registerDriver(d);
			Connection co = DriverManager.getConnection("jdbc:oracle:thin:@loaclhost:1521:xe","system","system");
			Statement st = (Statement) co.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			((java.sql.Statement) st).executeQuery("select *from dogbank");
			ResultSet rs = ((java.sql.Statement) st).executeQuery("select *from dogbank");
			while(rs.next()) {
				System.out.println(rs.first());
				System.out.println(rs.absolute(2));
				
				System.out.println(rs.last());
			}
			co.close();
		}
}
