package AdvanceJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ImageExecute {
	public static void main(String[] arsg) throws ClassNotFoundException, SQLException, FileNotFoundException {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection co = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			PreparedStatement ps = co.prepareStatement("insert into madhu values(?)");
			File f = new File("M:/PHOTOS/bunny/IMG_0001.JPG");
			FileInputStream fis = new FileInputStream(f);
			ps.setBlob(1,fis );
			int s = ps.executeUpdate();
			System.out.println("s"+s);
			System.out.println("sucessfully inserted pic" );
			
			
			
			
		
	}

}
