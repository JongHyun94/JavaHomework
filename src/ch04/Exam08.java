package ch04;

public class Exam08 {

	public static void main(String[] args) {
		/*
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		 */
		int sum = 0;
		int i;
		for(i=1; i<=10; i++) {
			sum += i; // sum = sum + i;
		}
		System.out.println("1~" + i +": " + sum);
	}

}
