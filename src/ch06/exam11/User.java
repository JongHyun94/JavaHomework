package ch06.exam11;

public class User {
	//Field
	String id;
	String name;
	String password;
	static String nation = "�ѱ�";  //static �� �پ������� ��ü�� ��� ��밡��
	//Constructor
	User (String name){
		this.name = name;
	}
	//Method
	static void info() { //static �� �پ������� ��ü�� ��� ��밡��
		System.out.println("��� User�� �ѱ����Դϴ�.");
	}
	void login() {
		System.out.println(name + "���� �α����մϴ�.");
	}
	void logout() {
		System.out.println(name + "���� �α׾ƿ��մϴ�.");
	}
	
}