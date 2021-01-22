package CallbleStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class Demo {
	public static void main(String[] args) throws SQLException
	{
		Driver d = new OracleDriver();
		DriverManager.registerDriver(d);
		Connection co= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		CallableStatement cs = co.prepareCall("{call Bunnymadhu(?,?,}");
		cs.setString(1, "x");
		cs.setInt(2, 143);
		cs.execute();
		cs.close();
	System.out.println("fuck off");
		
		}

}
