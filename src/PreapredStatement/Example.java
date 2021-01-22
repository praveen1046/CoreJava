package PreapredStatement;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class Example {
	public static void main(String[] args) throws SQLException
	{
		Driver d = new OracleDriver();
		DriverManager.registerDriver(d);
		Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		PreparedStatement ps = c.prepareStatement("insert  into Cell values(?,?,?)");
		ps.setString(1,"vivo 8");
		ps.setInt(2, 1434);
		ps.setInt(3, 1023);
		
		int doo = ps.executeUpdate("select *from Cell");
		System.out.println(ps);
		if(doo==1)
		{
			System.out.println("its working");
		}
		else
		{
			System.out.println("not working");
		}
		c.close();
	}

}
