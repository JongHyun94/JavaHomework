package ch06.exam12;

public class Example {

	public static void main(String[] args) {

		//�ùٸ� ���
		System.out.println(Calculator.pi);
		Calculator.plus(3,5);
		//�߸��� ���
		Calculator myC = new Calculator();
		System.out.println(myC.pi);
		myC.plus(3, 5);
	}

}
