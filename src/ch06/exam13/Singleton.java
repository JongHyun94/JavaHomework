package ch06.exam13;

public class Singleton {
	//Field
	private static Singleton singleton = new Singleton(); // 아무리 많은 객체를 생성해도 다 같은 곳을 가르킴 초기값 = 초기번지 지정
	
	//Constructor
	private Singleton() {
		
	}
	
	//Method
	static Singleton getInstance(){
	Singleton s = new Singleton();
		return singleton;
	}
	static int method1() {
		return 1;
	}
	static String method2() {
		return "자바";
	}
	static int[] method3() {
		int[] arr = {10,20,30};
		return arr;
	}

}
