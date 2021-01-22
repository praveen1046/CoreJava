import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class Jdbc {
	public static void main(String[] args) throws SQLException{
		
		Driver d = new OracleDriver();
		DriverManager.registerDriver(d);
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");//Connection con = new T4CConnection();
	    Statement st = con.createStatement();
	    st.executeQuery("create table medical(ordernumber number(4),cost number,medicinename varchar(50))");
	    System.out.println("table created");
	    con.close();
	    System.out.println("Connection is closed");
	
	
	}
	
}


