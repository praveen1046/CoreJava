package AdvanceJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateExample {
	
	public static void main(String[] ar)throws SQLException,ClassNotFoundException,IOException {
		
		try {
				
			
			
			
			
			
			
			
			
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
				PreparedStatement ps = con.prepareStatement("insert into date_ex values(?)");
				
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter Date ");
				String date =  br.readLine();
				
				SimpleDateFormat sdf = new SimpleDateFormat("YYYY-DD-MM");
				
				java.util.Date ud =  sdf.parse(date);
				
				long  l = ud.getTime();
				System.out.println("Time in milliseconds : "+l+"\n\n");
				
				java.sql.Date sd = new java.sql.Date(l);
				
				
				
				ps.setDate(1, sd);
				
				int count = ps.executeUpdate();
				
				System.out.println("Count value : "+count);

				System.out.println("Date inserted successfully");
				
				
				
				
				
				
				
				
				
				
				
		}catch(ParseException ps) {
			ps.printStackTrace();
		}
				
		
		
	}

}
