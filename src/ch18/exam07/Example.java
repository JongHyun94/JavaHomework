package ch18.exam07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Example {

	public static void main(String[] args) {
		String filePath = "C:\\Users\\ant94\\Documents\\JavaProject\\JavaHomework\\JavaHomework\\src\\ch18\\exam07\\data.txt";
		try {// �ü���� �⺻ ���ڼ��� �����

			Reader reader = new FileReader(filePath);

			/*
			 * FileInputStream fis = new FileInputStream(filePath); Reader reader = new
			 * InputStreamReader(fis,"UTF-8");
			 */

			// ���1

			/*
			 * while (true) { int charCode = reader.read(); if (charCode == -1)
			 * { break; } char chardata = (char) charCode;
			 * System.out.println(charCode + " : " + chardata); }
			 */
			 
			int charCode = -1;
			while ((charCode = reader.read()) != -1) {
				
				char chardata = (char) charCode;
				System.out.println(charCode + " : " + chardata);
			}

			reader.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) { // ������ �б� ������ ������ �߻�
			e.printStackTrace();
		}
	}

}
