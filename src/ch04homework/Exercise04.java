package ch04homework;
//while���� Math.random()�޼ҵ带 �̿��ؼ� �ΰ��� �ֻ����� �������� ������ ���� (��1,��2) ���·� ����ϰ�
//���� ���� 5�� �ƴϸ� ��� �ֻ����� ������, ���� ���� 5�̸� ������ ���ߴ� �ڵ带 �ۼ��غ�����. 
//���� ���� 5�� �Ǵ� ������ (1,4),(4,1),(2,3),(3,2)�Դϴ�.
public class Exercise04 {

	public static void main(String[] args) {
		
		boolean flag = true;
		int n1,n2;
		while(flag) {
			n1 = (int)(Math.random()*6)+1;
			n2 = (int)(Math.random()*6)+1;
			System.out.println("("+n1+","+n2+")");
			if((n1+n2)==5) {
				flag = false;
			}
		}

	}

}
