package ch18.exam16;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Example2 {

	public static void main(String[] args) throws Exception {
		
		
		String filePath = "C:\\Users\\ant94\\Documents\\JavaProject\\JavaHomework\\JavaHomework\\src\\ch18\\exam16\\data.txt";
		OutputStream os = new FileOutputStream(filePath);
		
		
		/*
		 * String data = "������ �������̴�.";// ����Ʈ�� �ٲ����
		 * 
		 * byte[] bytes = data.getBytes("UTF-8"); os.write(bytes); os.flush();
		 * 
		 * os.close();
		 */

		Writer writer = new OutputStreamWriter(os,"UTF-8");
		
		String data = "������ �������̴�.";
		writer.write(data);
		writer.flush();
		
		data = "������ �����ؿ�.";
		writer.write(data);
		writer.flush();
		
		writer.close();
	}

}
