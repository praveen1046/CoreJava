package JDBC;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;

public class Jdbcinsert {
	public static void main(String[] args) throws SQLException {
		Driver d = new OracleDriver();
		DriverManager.registerDriver(d);
		Connection co = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		Statement s = co.createStatement();
		s.executeUpdate("insert into Moviehall values(15,250, 'syera' )");
		System.out.println("table upadted ");
		ResultSet r =s.executeQuery("select *from Moviehall");
		System.out.println(r);
		while(r.next()) {
			System.out.println(r.getString(1)+" "+r.getString(2)+" "+r.getString(3)+" "+r.getString(4));
		}
		co.close();
		}
}
