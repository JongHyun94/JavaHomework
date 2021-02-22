package ch06.exam10;

public class Example {

	public static void main(String[] args) {
		Changer ch1 = new Changer();
		//Call by Value(���� �����ؼ� ȣ��)
		int value1 = 1;
		ch1.change(value1);
		System.out.println(value1); // �� �ȹٲ�
		
		//Call by Reference(������ �����ؼ� ȣ��)
		String value2 = "A";
		ch1.change(value2);
		System.out.println(value2);
		
		
		int[] arr1 = {0,0,0};
		ch1.change(arr1);
		System.out.println(arr1[0]); //0->2
		
		String[] arr3 = {"A","B","C"};
		ch1.change(arr3);
		System.out.println(arr3[0]);
		
		Member m1 = new Member();
		System.out.println(m1.age);
		ch1.change(m1);
		System.out.println(m1.age);
	}

}
