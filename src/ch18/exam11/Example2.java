package ch18.exam11;

import java.io.IOException;
import java.io.InputStream;

public class Example2 {

	public static void main(String[] args) {
		//System.in.read(); ���� �ڵ�
		
		
		
		try {
			InputStream is = System.in;
			byte[] data = new byte[100];
			while(true) {
				int readNum = is.read(data);//100����Ʈ�� ����
				String str = new String(data,0,readNum-2);
				System.out.println(str);
				//enterŰ�� 13���� 10���� ���ÿ� �����Ե�
			}
			
	
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
