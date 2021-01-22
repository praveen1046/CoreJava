package JDBC;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class JdbcCreate {
	public static void main(String[] args) throws SQLException
	{	 
		Driver d = new OracleDriver();
		DriverManager.registerDriver(d);
		 System.out.println("Driver register ");
		 Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		 Statement st = con.createStatement();
		 st.executeQuery("create table Moviehall(seatnumber number(4),ticketcost number,movienename varchar(50))");
		 System.out.println("table created");
		 con.close();
		 System.out.println("connection closed");
		 
	}
}
