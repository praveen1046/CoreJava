package BatchStatement;

import java.sql.DriverManager;

public class ExampleTruk {
	public static void main(String[] args) {
		Driver d = new OracleDriver();
		DriverManager.registerDriver(d);
		connection co = DriverManager.getConnection("jdbc:oracle:thin:@localhost:)
	}
}
