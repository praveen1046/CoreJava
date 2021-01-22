package BatchStatement;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class Example { 
	public static void main(String[] args) throws SQLException
	{
		Driver d = new OracleDriver();
		DriverManager.registerDriver(d);
		Connection co = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		Statement st= co.createStatement();
		//st.addBatch("Create table FamilyDaba (itemstyles varachar(20),itemcost number)");
		st.addBatch("insert into Cell values('hp',3,4)");
		st.addBatch("update Cell set  CELLCOST=80 where  cellemid=1520");
	
		int m[] =st.executeBatch();
		System.out.println("adding the batch");
		for(int a :m)
		{
			System.out.println(a);
		}
		
		
		
	co.close();
	}
}


