package DDT;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Task{
	public static void main(String[] args) throws IOException {
		//Step-1
		FileInputStream fig=new FileInputStream("./Test/Data.properties");
		//Step-2
		Properties pr= new Properties();
		//Step-3
		pr.load(fig);
		System.out.println(pr.getProperty("userName"));
		System.out.println(pr.getProperty("Password"));
		
	}
}				