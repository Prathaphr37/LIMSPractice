package data_driven_testing_programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class WriteDataToDataBase {

	public static void main(String[] args) throws Throwable {
		Driver driver = new Driver();
		// register for the data base
		DriverManager.registerDriver(driver);

		// get connection for the data base
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testyantra", "root", "root");

		// issue create statement
		Statement stat = con.createStatement();
		String query = "insert into sdet43 values(5,'pramod','fullstack',10);";

		// execute update
		int result = stat.executeUpdate(query);

		if (result == 1) {
			System.out.println("data updated");
		} else {
			System.out.println("data not updated");
		}
		
		// close the data base
		con.close();
	}
}
