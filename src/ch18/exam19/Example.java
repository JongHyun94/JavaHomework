package ch18.exam19;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Example {

	public static void main(String[] args) throws Exception {
		
		String filePath = "C:\\Users\\ant94\\Documents\\JavaProject\\JavaHomework\\JavaHomework\\src\\ch18\\exam19\\data.txt";
		OutputStream os = new FileOutputStream(filePath);
		
		
		String data1 = "�ȳ��ϼ���,";
		String data2 = "���� ���Ŀ�.";
		/*
		os.write(data1.getBytes());
		os.write("\n".getBytes());
		os.write(data2.getBytes());

		os.flush();
		os.close();
		*/
		
		//����� �Ȱ���. 
		//PrintStream out = new PrintStream(os);
		PrintWriter out = new PrintWriter(os);
		out.println(3);
		out.println(10.5); //���ڷ� ����Ȱ���. ���ھƴ�
		
		out.flush();
		out.close();
	}

}
