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
		 * String data = "오늘은 수요일이다.";// 바이트로 바꿔야함
		 * 
		 * byte[] bytes = data.getBytes("UTF-8"); os.write(bytes); os.flush();
		 * 
		 * os.close();
		 */

		Writer writer = new OutputStreamWriter(os,"UTF-8");
		
		String data = "오늘은 수요일이다.";
		writer.write(data);
		writer.flush();
		
		data = "오늘은 따뜻해요.";
		writer.write(data);
		writer.flush();
		
		writer.close();
	}

}
