package ch06.exam06;

public class Korean {
	//field
	String nation = "대한민국";
	String name;
	String ssn;
	int age;
	//constructor Overloading
	
	Korean(){
		this.name = "아무개";
		this.ssn = "0000000";
		this.age = 1;
		// this("아무개","0000000",1);
	}
	
	Korean(String name){
		System.out.println("Korean(String name) 실행");

		this.name = name;
		this.ssn = "1111111";
		this.age = 2;
		// this(name, "1111111", 2);
	}
	Korean(String name,String ssn){
		System.out.println("Korean(String name,Stlring ssn) 실행");

		this.name = name;
		this.ssn = ssn;
		this.age = 3;
		//this(name,ssn,1);
	}
	/* string string 타입이 이미 있어서 안됨 
	Korean(String name,String ssn){
		System.out.println("Korean(String name,String ssn) 실행");

		this.name = name;
		this.ssn = ssn;
	}
	*/
	Korean(String name,String ssn,int age){
		System.out.println("Korean(String name,String ssn,int age) 실행");

		this.name = name;
		this.ssn = ssn;
		this.age = age;
	}
}
