package ch18.exam09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		String filePath = "C:\\Users\\ant94\\Documents\\JavaProject\\JavaHomework\\JavaHomework\\src\\ch18\\exam09\\data.txt";
		try {// 운영체제의 기본 문자셋을 사용함

			Writer writer = new FileWriter(filePath);

			writer.write(new char[] {'A','한'});
			writer.write(new char[] {'B','글','C','D'},0,2);
			writer.write("오늘은 날씨가 좋음");
			writer.flush();
			writer.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) { // 파일의 읽기 권한이 없을때 발생
			e.printStackTrace();
		}
	}

}
