package ch04homework;
//While���� Scanner�� �̿��ؼ� Ű����κ��� �Էµ� �����ͷ� ����, ���, ��ȸ, ���� ����� �����ϴ� �ڵ带 �ۼ��غ�����.
//�� ���α׷��� �����Ű�� ������ ���� ���� ����� ���;� �մϴ�.
import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		int flag;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.����  | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-----------------------------");
			System.out.print("����> ");
			
			flag = Integer.parseInt(scanner.nextLine());
			
			if(flag==1) {
				System.out.print("���ݾ�>");
				balance = balance + Integer.parseInt(scanner.nextLine());
			}
			else if(flag==2) {
				System.out.print("��ݾ�>");
				balance = balance - Integer.parseInt(scanner.nextLine());
			}
			else if(flag==3) {
				System.out.print("�ܰ�>");
				System.out.println(balance);
			}
			else if(flag==4){
				break;
			}
			else {
				continue;
			}
		}
		
		System.out.println("���α׷� ����");

	}

}
