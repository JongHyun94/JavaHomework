package ch06.exam14;

public class Example {

	public static void main(String[] args) {
		
		//Korean.NATION = "미국"; // final 이라 안됨
		System.out.println(Korean.NATION);

		Korean.NATION = "미국"; 
		System.out.println(Korean.NATION);
		
		Korean k1 = new Korean("123456-1234567");
		//k1.ssn = "987654-9876543"; // x
	}

}
