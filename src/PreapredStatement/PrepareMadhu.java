package PreapredStatement;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

public class PrepareMadhu {
	public static void main(String[] args) throws SQLException
	{	
		Driver d = new OracleDriver();
		DriverManager.registerDriver(d);
		Connection co = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		PreparedStatement ps = co.prepareStatement("delete from Cell where (?)");
		ps.setString(1, "realme");
		int check = ps.executeUpdate("select * from Cell");
		if(check==1)
		{
			System.out.println("vasta ");
				}
		else
		{
			System.out.println("ranu nuyy pooo");
		}
		co.close();
	}

}
