package ch06.exam03;

public class Example {

	public static void main(String[] args) {
		//��ü ����
		Car myCar; //Car Ÿ���� myCar ���� ����
		myCar = new Car(); //Car() Ŭ���� ��ü �����Ͽ� ���� �� ����
		
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.price);
		System.out.println(myCar.old);
		System.out.println(myCar.speed);
		//�ʵ尪 ����
		myCar.company = "HyunDai";
		myCar.model = "Grandure";
		myCar.price = 200000;
		myCar.old = true;
		myCar.speed = 50;
		//�ʵ尪 �б�
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.price);
		System.out.println(myCar.old);
		System.out.println(myCar.speed);
	}
}
