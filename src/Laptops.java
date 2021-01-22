import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class Laptops {
	public static void main(String[] args) throws SQLException {
		Driver d = new OracleDriver();
		DriverManager.registerDriver(d);
		System.out.println("driver registered");
		Connection co = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		System.out.println("connection is connected");
		Statement s = co.createStatement();
		s.executeQuery("create table laptop(laptopname varchar(10),laptopid number,laptopcost number)");	
		System.out.println("table created");
		ResultSet rs = s.executeQuery("select *from laptop");
		co.close();
		
			
	}
}
