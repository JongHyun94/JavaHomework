package ch04homework;
//for���� �̿��ؼ� 1���� 100������ ���� �߿��� 3�� ����� ������ ���ϴ� �ڵ带 �ۼ��غ�����.
public class Exercise03 {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i=1;i<=100;i++) {
			if(i%3==0) {
				sum += i;
			}
			else
				continue;
		}
		System.out.println("3�� ����� �� " + sum);

	}

}
