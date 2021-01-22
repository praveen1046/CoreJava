package AdvanceJava;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import oracle.jdbc.OracleDriver;
import oracle.jdbc.driver;

public class Image {
	public static void main(String[] args) {
		Class.forName(OracleDriver.access_string);
		Connection c= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		PreparedStatement ps =c.prepareStatement("insert into ima(?)");
		File f = new File("M:/PHOTOS/bunny/IMG_0001.JPG");
		FileInputStream  fis =new FileInputStream(f);
		ps.setBytes(1, "x");
		int suce= ps.executeUpdate();
		System.out.println("suce"+suce);
		System.out.println("image inserted suce");
		
		
		
	}

}
