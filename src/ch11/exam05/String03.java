package ch11.exam05;

import java.util.StringTokenizer;

public class String03 {
	public static void main(String[] args) {
		String ssn = "123456-1234567";  //한번 생성된 문자열은 불변
		char sex = ssn.charAt(7); // 1 get
		if (sex == '1' || sex == '3') {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		
		//문자열 잘라내기: 방법1
		String first = ssn.substring(0, 6);
		String second = ssn.substring(7);

		System.out.println(first);
		System.out.println(second);
		
		//문자열 잘라내기: 방법2
		String[] parts = ssn.split("-");
		System.out.println(parts[0]);
		System.out.println(parts[1]);
		
		//문자열 분리하기: 방법3
		StringTokenizer st = new StringTokenizer(ssn,"-");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		/*		first = st.nextToken();
				second = st.nextToken();
				
				System.out.println(first);
				System.out.println(second);
				*/
		//포함 여부: 방법1
		String content = "이것은 자바 책입니다.";
		boolean result = content.contains("자바"); // true
		System.out.println(result);
		
		//포함 여부: 방법2 
		int index = content.indexOf("자바"); //인덱스가 시작 되는 위치 ( 4 ) 넘겨줌 찾는게 없으면 -1
		
		if(index != -1) {
			System.out.println("자바 관련 책이군요");
		}
		else {
			System.out.println("자바 관련 책이 아니군요");
		}
		
		//문자열의 길이
		int length = content.length();
		System.out.println(length);
		
		//대치하기
		String modifiedContent = content.replace("자바", "Java"); // 새로운 문자열이 리턴되어 그값을 넣어줌
		System.out.println(modifiedContent);
	}

}
