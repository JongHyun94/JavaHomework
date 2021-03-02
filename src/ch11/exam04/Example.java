package ch11.exam04;

public class Example {

	public static void main(String[] args) {
		Class var1 = A.class; //A가 로딩된 번지를 얻을 수 있다.
		
		A a = new A();
		Class var2 = a.getClass(); //A가 로딩된 번지를 얻을 수 있다.

	}

}
