package ch07.exam02;

public class Child extends Parent{
	
	public int fiedl2;
	
	public Child() {
		System.out.println("child�� �����ڰ� �����");
	}
	
	public void method2() {
		System.out.println("method2(Child)");
	}
	
	@Override
	public void sound() {
		System.out.println("�Ⱦ��~~~~~~~~");
	}
}
