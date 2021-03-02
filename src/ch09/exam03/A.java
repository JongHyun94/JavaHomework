package ch09.exam03;

public class A {
	public void method(int x) {
		int y = 2;
		
		//x = 10;   //x는 final이라 값을 바꿀수없다.
		//y = 10;   //y는 final이라 값을 바꿀수없다.
		
		class B{
			public void method() {
				int result = x + y;   // final 값임
			}
		}
	}
}
