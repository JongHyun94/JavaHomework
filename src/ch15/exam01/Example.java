package ch15.exam01;

import java.util.List;
import java.util.ArrayList;

public class Example {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();   //<> generic 타입 : 받을 타입을 미리 선언해줌
		//객체 저장
		list.add("hong");
		list.add("3");
		list.add("new Board()");
		System.out.println(list.size());

		//객체 얻기
		String name = list.get(0); //return 타입이 generic 에 있는 타입으로 바뀜 원래는 obj
		String value = list.get(1); 
		String board = list.get(2);
		
		
		
		//객체 제거
		list.remove(0);
		list.remove(0);
		System.out.println(list.size());
		
		
		
	}

}
