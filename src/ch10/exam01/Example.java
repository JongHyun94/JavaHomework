package ch10.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example {

	public static void main(String[] args) throws FileNotFoundException {
		int[] arr = null;
		arr[0] = 10; //NullPinterException => ���� ���� (�����Ϸ��� üũ���� ����)
		
		// FileNotFoundException  => �Ϲ� ���� (������ üũ ����)
		FileInputStream fi = new FileInputStream("C:/Temp/file.txt");
	}

}
