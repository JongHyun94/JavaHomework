package ch07.exam01;

public class Parent {
	public String lastname;
	public String firstname;
	
	public Parent(String lastname,String firstname) {
		System.out.println("Parent�� �����ڰ� �����");
		this.lastname=lastname;
		this.firstname=firstname;
	}
	
	public void method1() {
		System.out.println("method1(Parent)");
	}

}
