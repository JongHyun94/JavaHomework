package ch18.exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class InputStreamExample {

	public static void main(String[] args) {

		String filePath = "C:\\Users\\ant94\\Documents\\JavaProject\\JavaHomework\\JavaHomework\\src\\ch18\\exam02\\data.txt";
		try {
			InputStream is = new FileInputStream(filePath);// 프로그램 기준에서 데이터가 들어오는것

			byte[] data = new byte[3];

			/*
			 * int readNum = is.read(data);
			 * 
			 * System.out.println(readNum + ": " + Arrays.toString(data));
			 * 
			 * readNum = is.read(data);
			 * 
			 * System.out.println(readNum + ": " + Arrays.toString(data));
			 * 
			 * readNum = is.read(data);
			 * 
			 * System.out.println(readNum + ": " + Arrays.toString(data));
			 */
			
			//방법1
			/*
			 * while(true) { int readNum=is.read(data); if(readNum==-1) { break; }
			 * System.out.println(readNum + ": " + Arrays.toString(data)); }
			 */
			
			//방법2
			int readNum = -1;
			while((readNum = is.read(data)) != -1) {
				System.out.println(readNum + ": " + Arrays.toString(data));
			}
			
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
