package JDBC;

import java.beans.Statement;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;

import oracle.jdbc.driver.OracleDriver;

public class DateExa {
	public static void main(String[] args) {
		 Driver d = new OracleDriver();
		DriverManager.getConnection(d);
		Connection co = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		java.sql.Statement s = co.createStatement();
		s.executeQuery("create table madhu");
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
		
		System.out.println("Count value : "+count)
	
		
	}

}
