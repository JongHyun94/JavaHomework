package ch07.exam01;

public class Child extends Parent{
	
	
	public Child(String firstName) {
		super("��",firstName);
		System.out.println("child�� �����ڰ� �����");
	}
	
	public void method2() {
		System.out.println("method2(Child)");
	}
}
