package ch10.exam05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example {

	/*	public static void main(String[] args) {
			
			method();
		}
		
		public static void method() { // static�� �ٿ��� ���� ��ü�� �ȸ�����. 
			//System.out.println("�����");
			try {
				FileInputStream fis = new FileInputStream("C:/file.txt");
			} catch (FileNotFoundException e) {
				System.out.println("������ �����ϴ�.");
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

	public static void method(String filePath) throws FileNotFoundException { // static�� �ٿ��� ���� ��ü�� �ȸ�����.

		FileInputStream fis = new FileInputStream(filePath);
	}

}
