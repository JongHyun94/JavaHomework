package ch11.exam07;

public class Example3 {

	public static void main(String[] args) {
		/*Integer var1 = new Integer(500);
		Integer var2 = new Integer(500);*/
		
		/*Integer var1 = 500;
		Integer var2 = 500;*/
		
		Integer var1 = 10;  //-128~127 사이일땐 객체 공유
		Integer var2 = 10;
		
		System.out.println(var1 == var2); // wrapper 객체일때는 == 쓰지말기
		System.out.println(var1.equals(var2));
		
		

	}

}
