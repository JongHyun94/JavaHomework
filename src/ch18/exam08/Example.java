package ch18.exam08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		String filePath = "C:\\Users\\ant94\\Documents\\JavaProject\\JavaHomework\\JavaHomework\\src\\ch18\\exam08\\data.txt";
		try {// 운영체제의 기본 문자셋을 사용함

			Reader reader = new FileReader(filePath);

			char[] data = new char[2];
			int readNum = -1;
			String str = "";
			while((readNum = reader.read(data))!=-1) {
				/*
				 * String str = new String(data); 
				 * System.out.println(str);
				 */
				str += new String(data,0,readNum);
				//System.out.println(Arrays.toString(data));
			}
			System.out.println(str);
			reader.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) { // 파일의 읽기 권한이 없을때 발생
			e.printStackTrace();
		}
	}

}
