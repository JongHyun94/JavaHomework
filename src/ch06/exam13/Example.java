package ch06.exam13;

public class Example {

	public static void main(String[] args) {
		//생성자를 이용해서 객체 얻기
		
		//Singleton result5 = new Singleton(); // private 로 선언하면 new 로 생성 물가능 

		
		
		//Factory Method 이용해서 객체 얻기
		int result1 = Singleton.method1();
		String result2 = Singleton.method2();
		int[] result3 = Singleton.method3();
		Singleton result4 = Singleton.getInstance();
		Singleton result5 = Singleton.getInstance();
		
		if(result5==result4) {
			System.out.println("같은객체를 참조");
		}
		else {
			System.out.println("다른객체를 참조");
		}
	}

}
