package ch07.exam01;

public class Example {

	public static void main(String[] args) {
		Child child=new Child("�浿");
		
		System.out.println(child.firstname);
		System.out.println(child.lastname);
		
		child.method1();
		child.method2();
	}
	

}
