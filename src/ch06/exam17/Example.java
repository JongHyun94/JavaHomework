package ch06.exam17;

public class Example {

	public static void main(String[] args) {
		User u1 = new User();
		//ui.id = "%^&%&^%";  //
		//u1.age = -10;       // private 여서 바로는 못넣음
		
		
		/*
		u1.setAge(-10);
	
		System.out.println(u1.getAge());
		
		*/
		u1.setAdult(true);
		System.out.println(u1.isAudlt());
	}

}
