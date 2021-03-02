package ch11.exam01;

public class Example {

	public static void main(String[] args) {

		Member m1 = new Member("winter","늦겨울");
		Member m2 = new Member("winter","늦겨울");
		
		System.out.println(m1==m2);
		System.out.println(m1.equals(m2));  // 원래는 번지 비교라 == 과 똑같다.
											// 재정의 후 내부 값을 비교한다. 
	}

}
