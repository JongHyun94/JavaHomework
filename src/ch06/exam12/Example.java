package ch06.exam12;

public class Example {

	public static void main(String[] args) {

		//棵官弗 规过
		System.out.println(Calculator.pi);
		Calculator.plus(3,5);
		//肋给等 规过
		Calculator myC = new Calculator();
		System.out.println(myC.pi);
		myC.plus(3, 5);
	}

}
