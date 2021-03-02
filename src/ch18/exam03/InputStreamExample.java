package ch18.exam03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class InputStreamExample {

	public static void main(String[] args) {

		String filePath = "C:\\Users\\ant94\\Documents\\JavaProject\\JavaHomework\\JavaHomework\\src\\ch18\\exam03\\data.txt";
		try {
			InputStream is = new FileInputStream(filePath);// 프로그램 기준에서 데이터가 들어오는것

			byte[] data = new byte[8];

			int readNum = -1;
			while((readNum = is.read(data,2,3)) != -1) { //2 index부터 저장되서 3개만큼 저장함
				System.out.println(readNum + ": " + Arrays.toString(data));
			}
			
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
