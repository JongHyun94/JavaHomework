package ch18.exam19;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Example {

	public static void main(String[] args) throws Exception {
		
		String filePath = "C:\\Users\\ant94\\Documents\\JavaProject\\JavaHomework\\JavaHomework\\src\\ch18\\exam19\\data.txt";
		OutputStream os = new FileOutputStream(filePath);
		
		
		String data1 = "안녕하세요,";
		String data2 = "이제 마쳐요.";
		/*
		os.write(data1.getBytes());
		os.write("\n".getBytes());
		os.write(data2.getBytes());

		os.flush();
		os.close();
		*/
		
		//결과는 똑같다. 
		//PrintStream out = new PrintStream(os);
		PrintWriter out = new PrintWriter(os);
		out.println(3);
		out.println(10.5); //문자로 저장된거임. 숫자아님
		
		out.flush();
		out.close();
	}

}
