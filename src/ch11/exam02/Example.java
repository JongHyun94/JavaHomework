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
		
		Member m1 = new Member("winter","�ʰܿ�");
		System.out.println(m1.toString());
		System.out.println(m1);  //println�� ���������� toString()�� ȣ���Ѵ�. �׷��� ���� ����.
		
		String result = m1 + " => spring: ������"; //�׳� ȣ�� �ϸ� toString�� ���� �ȰŴ�.
		
	}

}
