package AdvanceJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ImageExample {
	
	public static void  main(String[] ar)throws SQLException,ClassNotFoundException, FileNotFoundException {
		
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		PreparedStatement ps = con.prepareStatement("insert into employee_img values(?,?)");
		
		File f = new File("M:/PHOTOS/bunny/IMG_0001.JPG");
		FileInputStream fis = new  FileInputStream(f);
		
		ps.setString(1, "madhu");
		ps.setBlob(2, fis);
		
		int success  = ps.executeUpdate();
		System.out.println("Success : "+success);
		System.out.println("Image inserted successfully");
		
		
		
	}

}
