package ch18.exam11;

import java.io.IOException;
import java.io.InputStream;

public class Example2 {

	public static void main(String[] args) {
		//System.in.read(); 같은 코드
		
		
		
		try {
			InputStream is = System.in;
			byte[] data = new byte[100];
			while(true) {
				int readNum = is.read(data);//100바이트만 읽음
				String str = new String(data,0,readNum-2);
				System.out.println(str);
				//enter키는 13번과 10번이 동시에 나오게됨
			}
			
	
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
