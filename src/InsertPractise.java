import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;

public class InsertPractise {
	
	public static void main(String[] ar) throws SQLException {
		
		
		DriverManager.registerDriver(new OracleDriver());
		Connection co = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		Statement st = co.createStatement();
		System.out.println(st);
		ResultSet c = st.executeQuery("select * from medical");
		
		while(c.next()) {
			System.out.println(c.getString(1)+" "+c.getString(2)+" "+c.getString(3));
		}
		
		co.close();
		
	}

}


