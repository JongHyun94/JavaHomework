package ch06homework;
//return��
public class Car4Example {

	public static void main(String[] args) {
		Car4 myCar = new Car4();
		
		myCar.setGas(5); //Car�� setGas() �޼ҵ� ȣ��

		boolean gasState = myCar.isLeftGas(); //Car�� isLeftGas() �޼ҵ� ȣ��
		if(gasState) {
			System.out.println("����մϴ�.");
			myCar.run(); //Car�� run()�޼ҵ� ȣ��
		}
		else {
			System.out.println("gas�� �����ϼ���.");
		}
	}

}
