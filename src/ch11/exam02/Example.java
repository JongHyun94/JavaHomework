package ch11.exam02;

import java.util.Date;

public class Example {

	public static void main(String[] args) {
		
		Object var1 = new Object();
		System.out.println(var1.toString());
		
		Date now = new Date();
		System.out.println(now.toString());
	
		String str = "abc";
		System.out.println(str.toString());
		
		Member m1 = new Member("winter","늦겨울");
		System.out.println(m1.toString());
		System.out.println(m1);  //println은 참조변수의 toString()을 호출한다. 그래서 위와 같다.
		
		String result = m1 + " => spring: 봄돌이"; //그냥 호출 하면 toString이 포함 된거다.
		
	}

}
