package ch18.exam11;

import java.io.IOException;
import java.io.InputStream;

public class Example {

	public static void main(String[] args) {
		//System.in.read(); 같은 코드
		
		
		
		try {
			InputStream is = System.in;//inputstream 타입
			
			while(true) {
				int keyCode = is.read();//1바이트만 읽음
				System.out.println(keyCode);
				//enter키는 13번과 10번이 동시에 나오게됨
			}
			
	
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
