package ch18.exam16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Example {

	public static void main(String[] args) throws Exception {
		
		//InputStream is = System.in;
		
		//规过 1
		/*byte[] data = new byte[100];
		
		int readNum = is.read(data);
		String str = new String(data,0,readNum-2);
		System.out.println(str);
		
		readNum = is.read(data);
		str = new String(data,0,readNum-2);
		System.out.println(str);*/

		//规过2
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String str = br.readLine();
		System.out.println(str);
		
		str = br.readLine();
		System.out.println(str);
	}

}
