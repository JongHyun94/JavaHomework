package ch06.exam14;

public class Example {

	public static void main(String[] args) {
		
		//Korean.NATION = "�̱�"; // final �̶� �ȵ�
		System.out.println(Korean.NATION);

		Korean.NATION = "�̱�"; 
		System.out.println(Korean.NATION);
		
		Korean k1 = new Korean("123456-1234567");
		//k1.ssn = "987654-9876543"; // x
	}

}
