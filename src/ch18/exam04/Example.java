package ch18.exam04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class Example {
	public static void main(String[] args) {

		String filePath = "C:\\Users\\ant94\\Documents\\JavaProject\\JavaHomework\\JavaHomework\\src\\ch18\\exam04\\data.txt";
		try {
			OutputStream os = new FileOutputStream(filePath);// ���α׷� ���ؿ��� �����Ͱ� �����°�
			os.write(65);
			os.write(66);
			os.write(67);
			os.flush();
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
