package AdvanceJava;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DispalyImage {
	
	public static void main(String[] ar)throws SQLException,ClassNotFoundException, IOException {
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		Statement st = con.createStatement();
		
		
		ResultSet rs = st.executeQuery("selct * from employee_img");
		
		
		while(rs.next()) {
			
			
			FileOutputStream fs = new FileOutputStream(rs.getString(1)+".jpg");
			fs.write(rs.getByte(2));
			
			System.out.println("image created");
			
		}
		
		
		con.close();
		
		
	}

}
