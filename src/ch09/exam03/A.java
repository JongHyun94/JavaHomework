package ch09.exam03;

public class A {
	public void method(int x) {
		int y = 2;
		
		//x = 10;   //x�� final�̶� ���� �ٲܼ�����.
		//y = 10;   //y�� final�̶� ���� �ٲܼ�����.
		
		class B{
			public void method() {
				int result = x + y;   // final ����
			}
		}
	}
}
