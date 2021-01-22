package AdvanceJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MetaDataEX {
	
	
	public static void main(String[] ar)throws ClassNotFoundException,SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		
		Testing    t = Test3.getObject();
		
		System.out.println(t);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		PreparedStatement ps = con.prepareStatement("select ordernumber,cost from medical");
		
		ResultSet rs = ps.executeQuery();
		
		ParameterMetaData dm = ps.getParameterMetaData();
		
		System.out.println(dm.getParameterClassName(1));
		System.out.println(dm.getParameterType(1));
		System.out.println(dm.getParameterMode(1));
	}

}
