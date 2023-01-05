package data_driven_testing_programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ReadDataFromDataBase {

	public static void main(String[] args) throws Throwable {
		Driver driver = new Driver();
		//register for the data base
		DriverManager.registerDriver(driver);
		
		//get connection for the data base
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testyantra", "root", "root");
		
		//issue create statement
		Statement stat = con.createStatement();
		String query="select * from sdet43;";
		
		//execute query
		ResultSet result = stat.executeQuery(query);
		
		while (result.next()) {
			System.out.println(result.getString(1)+"  "+result.getString(2)+"  "+result.getString(3)+"  "+result.getString(4));
		}
		
		//close the data base
		con.close();
	}
}
