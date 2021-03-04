package ch18.exam10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.util.Arrays;

public class Example {

	public static void main(String[] args) {

		// 복사할 파일 위치
		String filePath1 = "C:\\Users\\ant94\\Documents\\JavaProject\\JavaHomework\\JavaHomework\\src\\ch18\\exam10\\data.txt";
		// 복사된 파일 위치
		String filePath2 = "C:\\Users\\ant94\\Documents\\JavaProject\\JavaHomework\\JavaHomework\\src\\ch18\\exam10\\data2.txt";

		try {
			Reader reader = new FileReader(filePath1);
			Writer writer = new FileWriter(filePath2);
			
			char[] data = new char[1024];
			int readNum = -1;
			while((readNum = reader.read(data))!=-1) {
				writer.write(data,0,readNum);
			}
			writer.flush();
			
			reader.close();
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) { // 파일의 읽기 권한이 없을때 발생
			e.printStackTrace();
		}
	}

}
