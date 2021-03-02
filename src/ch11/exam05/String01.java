package ch11.exam05;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class String01 {

	public static void main(String[] args) {
		byte[] arr = {65, 66, 67};
		
		//바이트 배열을 문자열로 만들고 싶다
		
		String str = new String(arr);
		System.out.println(str);
		
		String str2 = "ABC";
		byte[] arr2 = str2.getBytes();
		System.out.println(Arrays.toString(arr2));
		
		String str3 = "가나다";
		try {
			byte[] arr31 = str3.getBytes("EUC-KR");
			byte[] arr32 = str3.getBytes("UTF-8");
			System.out.println(Arrays.toString(arr31));
			System.out.println(Arrays.toString(arr32));
		} catch (Exception e) {	
			e.printStackTrace();
		}
		
	}

}
