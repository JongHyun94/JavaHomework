package ch15.exam04;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Example1 {
	public static void main(String[] args) {
		
		//Map객체 생성
		Map<String, String> map = new HashMap<>(); //중복이면 생략가능
		
		//Entry 저장
		map.put("name1", "홍길동1");
		map.put("name2", "홍길동2");
		map.put("name3", "홍길동3");
		//map.put(2, new Date());	//맞지않은 타입이기에 오류 발생
	
		System.out.println(map.size());
		
		//Entry 가져오기
		String s1 = map.get("name1");
		System.out.println(s1);
		
		//반복 처리 방법1
		Set<Entry<String, String>>set = map.entrySet();
		for(Entry<String, String> entry : set) {
			System.out.println(entry.getKey()+" : " +entry.getValue());
			
		}
		
		//반복 처리 방법2
		Set<String> set2 = map.keySet();
		for(String key : set2) {
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}
		
		//삭제
		map.remove("name1");
		map.clear();
	}
}
