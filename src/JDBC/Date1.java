package JDBC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Date1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException, ParseException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection co = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		PreparedStatement ps = co.prepareStatement("insert into todaydate values(?)");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Date:");
		String date = bf.readLine();
		SimpleDateFormat sdf = new SimpleDateFormat("DD_MM_YYYY");
		java.util.Date jud = sdf.parse(date);
		long i = jud.getTime();
		System.out.println("time in mm:"+i);
		java.sql.Date jsd = new java.sql.Date(1);
		ps.setDate(1, jsd);
		int count =ps.executeUpdate();
		
		System.out.println("count value:"+count);
		System.out.println("date inserted ");
		
		
		
		
		
	}

}
