package ch18.exam15;

import java.io.File;

public class Example1 {

	public static void main(String[] args) {
		File file = new File("C:/Temp/data.txt");
		if(file.isDirectory()) {
			System.out.println("folder");
		}
		else {
			System.out.println("file");
		}
		
		file = new File("C:/Temp/dir1/data.txt");
		if(file.isFile()) {
			long size = file.length();
			System.out.println(size);
		}
	}

}
