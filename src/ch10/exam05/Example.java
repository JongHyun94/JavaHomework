package ch10.exam05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example {

	/*	public static void main(String[] args) {
			
			method();
		}
		
		public static void method() { // static을 붙여서 따로 객체를 안만들어도됨. 
			//System.out.println("실행됨");
			try {
				FileInputStream fis = new FileInputStream("C:/file.txt");
			} catch (FileNotFoundException e) {
				System.out.println("파일이 없습니다.");
			}
		}*/

	public static void main(String[] args) {

		try {
			method("C:/file.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("file no");
		}
	}

	public static void method(String filePath) throws FileNotFoundException { // static을 붙여서 따로 객체를 안만들어도됨.

		FileInputStream fis = new FileInputStream(filePath);
	}

}
