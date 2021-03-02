package ch15.exam05;

import java.io.FileReader;
import java.util.Properties;

public class Example {

	public static void main(String[] args) throws Exception {
		Properties prop = new Properties();
		
		String path = Example.class.getResource("database.properties").getPath(); //경로 찾기 중요		
		prop.load(new FileReader(path));

		//prop.load(new FileReader("C:\\Users\\ant94\\Documents\\JavaProject\\JavaHomework\\JavaHomework\\src\\ch15\\exam05\\database.properties"));
		String driver = prop.getProperty("driver");
		System.out.println(driver);
		
		String nation = prop.getProperty("nation");
		System.out.println(nation);
		
	}

}
