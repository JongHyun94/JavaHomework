package ch18.exam05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class Example {
	public static void main(String[] args) {

		String filePath = "C:\\Users\\ant94\\Documents\\JavaProject\\JavaHomework\\JavaHomework\\src\\ch18\\exam05\\data.txt";
		try {
			OutputStream os = new FileOutputStream(filePath);
			byte[] arr = {65,66,67};
			os.write(arr);
			os.write(arr,0,arr.length);
			os.flush();
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
