package ch18.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {

	public static void main(String[] args) {
		
		String filePath = "C:\\Users\\ant94\\Documents\\JavaProject\\JavaHomework\\JavaHomework\\src\\ch18\\exam01\\photo3.jpg";
		try {
			InputStream is = new FileInputStream(filePath);//프로그램 기준에서 데이터가 들어오는것
			//방법1
			/*
			 * while(true) { int data = is.read(); if(data==-1) { break; }
			 * System.out.println(data);
			 * 
			 * }
			 */
			
			//방법2
			int data = -1;
			while((data = is.read()) != -1) {
				System.out.print((char)data);
			}
			/*
			 * int byte1 = is.read(); int byte2 = is.read(); int byte3 = is.read(); int
			 * byte4 = is.read(); System.out.println((char)byte1);
			 * System.out.println((char)byte2); System.out.println((char)byte3);
			 * System.out.println((char)byte4);
			 */
			is.close();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
