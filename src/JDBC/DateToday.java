package JDBC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateToday {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException, ParseException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection co = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		PreparedStatement ps = co.prepareStatement("insert into today values(?)");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the Today's date:");
		String date = bf.readLine();
		SimpleDateFormat sdf = new SimpleDateFormat("DD_MM_YYYY");
		java.util.Date ud = sdf.parse(date);
		long i = ud.getTime();
		System.out.println("mm:"+i);
		java.sql.Date sd = new java.sql.Date(1);
		ps.setDate(1, sd);
		int val = ps.executeUpdate();
		System.out.println("val"+val);
		System.out.println("sucess ");
		
		
		
		
	}

}
