package ch06.exam06;

public class Korean {
	//field
	String nation = "���ѹα�";
	String name;
	String ssn;
	int age;
	//constructor Overloading
	
	Korean(){
		this.name = "�ƹ���";
		this.ssn = "0000000";
		this.age = 1;
		// this("�ƹ���","0000000",1);
	}
	
	Korean(String name){
		System.out.println("Korean(String name) ����");

		this.name = name;
		this.ssn = "1111111";
		this.age = 2;
		// this(name, "1111111", 2);
	}
	Korean(String name,String ssn){
		System.out.println("Korean(String name,Stlring ssn) ����");

		this.name = name;
		this.ssn = ssn;
		this.age = 3;
		//this(name,ssn,1);
	}
	/* string string Ÿ���� �̹� �־ �ȵ� 
	Korean(String name,String ssn){
		System.out.println("Korean(String name,String ssn) ����");

		this.name = name;
		this.ssn = ssn;
	}
	*/
	Korean(String name,String ssn,int age){
		System.out.println("Korean(String name,String ssn,int age) ����");

		this.name = name;
		this.ssn = ssn;
		this.age = age;
	}
}
