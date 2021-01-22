package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConcurrencyEXample {
	
	public static void main(String[] ar) {
		
				
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			//System.out.println("connection is established");
			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			//System.out.println("Statement object is created");
			ResultSet rs = st.executeQuery("select * from cell");
			//System.out.println("ResultSEt Object "+rs);
			
			System.out.println("after");
			System.out.println(rs.absolute(4));
		    rs.updateInt("CELLCOST",5078);
			rs.updateString(1,"dell");
			
			rs.updateRow();
			System.out.println("Data deleted");
			con.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
