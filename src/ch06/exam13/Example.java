package ch06.exam13;

public class Example {

	public static void main(String[] args) {
		//�����ڸ� �̿��ؼ� ��ü ���
		
		//Singleton result5 = new Singleton(); // private �� �����ϸ� new �� ���� ������ 

		
		
		//Factory Method �̿��ؼ� ��ü ���
		int result1 = Singleton.method1();
		String result2 = Singleton.method2();
		int[] result3 = Singleton.method3();
		Singleton result4 = Singleton.getInstance();
		Singleton result5 = Singleton.getInstance();
		
		if(result5==result4) {
			System.out.println("������ü�� ����");
		}
		else {
			System.out.println("�ٸ���ü�� ����");
		}
	}

}
