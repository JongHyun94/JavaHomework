package ch06.exam16.pack1;

public class Car {
	// String model;  //아무것도 안적히면 default 접근 = 같은 페키지 안에서 사용가능
	public String model; // public 붙이면 다른 패키지안에서도 사용가능
	
	
	/**
	 * public Car(){  // 기본값은 public 임. 같은 패키지일때 는 ㅡpublic 빼줘도됨 private는 같은 패키지여도 못함
	 * }
	 */
	
	public void run() {
		System.out.println("run");
	}
}
