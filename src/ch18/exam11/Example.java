package ch18.exam11;

import java.io.IOException;
import java.io.InputStream;

public class Example {

	public static void main(String[] args) {
		//System.in.read(); ���� �ڵ�
		
		
		
		try {
			InputStream is = System.in;//inputstream Ÿ��
			
			while(true) {
				int keyCode = is.read();//1����Ʈ�� ����
				System.out.println(keyCode);
				//enterŰ�� 13���� 10���� ���ÿ� �����Ե�
			}
			
	
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
