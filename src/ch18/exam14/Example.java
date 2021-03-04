package ch18.exam14;

import java.io.Console;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {

		try {
			String path = "C:\\Users\\ant94\\Documents\\JavaProject\\JavaHomework\\JavaHomework\\src\\ch18\\exam14\\data.txt";
			InputStream is;
			is = new FileInputStream(path);
			Scanner scanner = new Scanner(is);
			
			int count = 1;
			while (true) {
				try {
					String data = scanner.nextLine();
					System.out.println(count+": " +data);
					count++;
				} catch (NoSuchElementException e) {//더이상 읽을것이 없을때
					break;
				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
