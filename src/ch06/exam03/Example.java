package ch06.exam03;

public class Example {

	public static void main(String[] args) {
		//객체 생성
		Car myCar; //Car 타입의 myCar 변수 선언
		myCar = new Car(); //Car() 클래스 객체 생성하여 참조 값 저장
		
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.price);
		System.out.println(myCar.old);
		System.out.println(myCar.speed);
		//필드값 변경
		myCar.company = "HyunDai";
		myCar.model = "Grandure";
		myCar.price = 200000;
		myCar.old = true;
		myCar.speed = 50;
		//필드값 읽기
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.price);
		System.out.println(myCar.old);
		System.out.println(myCar.speed);
	}
}
