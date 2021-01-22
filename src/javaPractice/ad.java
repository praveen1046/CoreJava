package javaPractice;

import java.sql.Driver;
import java.sql.DriverManager;
import oracle.jdbc.driver.OracleDriver;
import java.sql.SQLException;

class ad
{
	public static void main(String[] ar)
	{
		Driver o = new OracleDriver();

	
	try
	{
		
		DriverManager.registerDriver(o);
		System.out.println("this is registerdriver");
	}
	catch(SQLException se)
	{
		se.printStackTrace();
	}
	}
}


