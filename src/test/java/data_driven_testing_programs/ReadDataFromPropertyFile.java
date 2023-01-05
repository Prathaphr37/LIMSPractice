package data_driven_testing_programs;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws Throwable {

//	    step-1 :- Get the java representation object of the physical file using FileInputStream
		FileInputStream fi = new FileInputStream("./src/test/resources/commondata.properties");

//		step-2 :- create object for the Properties Class
		Properties pobj = new Properties();

//		step-3 :- load all the keys using load() method
		pobj.load(fi);

//		step-4 :- read the data from property file using getProperty() method
		String BROWSER = pobj.getProperty("browser");
		String URL = pobj.getProperty("url");
		String USERNAME = pobj.getProperty("username");
		String PASSWORD = pobj.getProperty("password");
		
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
	}
}
