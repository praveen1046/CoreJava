package PreapredStatement;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class PreparedStatementOne {
	public static void main(String[] args) throws SQLException
	{
		Driver d = new OracleDriver();
		DriverManager.registerDriver(d);
		System.out.println("register the driver");
		Connection co= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		PreparedStatement ps = co.prepareStatement("insert into cell values(?,?,?)");
		ps.setString(1,"mi");
		ps.setInt(2, 1250);
		ps.setInt(3,1523 );
		
		 
		
		int checking= ps.executeUpdate();
		System.out.println(checking);
		if(checking==1)
		{
			System.out.println("user login");
		}
		else
			
		{
			System.out.println("user out");
		}
		co.close();
	}
}