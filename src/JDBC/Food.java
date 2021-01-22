package JDBC;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class Food {
	 public static void main(String[] args) throws SQLException {
		 Driver D = new OracleDriver();
		 DriverManager.registerDriver(D);
		 Connection co = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		 Statement st = co.createStatement();
		 st.executeQuery("craete table Food(Foodtype varachar(10),Foodname varchar(15),Foodcost number)");
		 System.out.println(st);
		 co.close();
		 
	 }
	 
	

}
