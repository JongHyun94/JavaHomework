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
			InputStream is = new FileInputStream(filePath);// ���α׷� ���ؿ��� �����Ͱ� �����°�

			byte[] data = new byte[8];

			int readNum = -1;
			while((readNum = is.read(data,2,3)) != -1) { //2 index���� ����Ǽ� 3����ŭ ������
				System.out.println(readNum + ": " + Arrays.toString(data));
			}
			
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
