package ch05homework;
//������ Ű����κ��� �л� ���� �� �л����� ������ �Է¹޾Ƽ�,
//�ְ� ���� �� ��� ������ ���ϴ� ���α׷��̴�.
//���� ����� ����, �˸°� �ۼ��غ�����(����� 16���ο��� Scanner�� nextInt() 
//�޼ҵ�� �ֿܼ� �Էµ� ���ڸ� �а� �����մϴ�).
import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("-------------------------------------------");
			System.out.print("����> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				//�л���>3
				System.out.print("�л���> ");
				studentNum = scanner.nextInt();
				//studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
			}
			else if(selectNo == 2) {
				//studentNum�� ���� scores�� �Է�
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores[" + i + "]: ");
					scores[i] = scanner.nextInt();
					//studentNum = Integer.parseInt(scanner.nextLine());
				}
			}
			else if(selectNo == 3) {
				//����Ȱ��� ���
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
				}
			}
			else if(selectNo == 4) {
				//�ְ� ����, ��� ����
				int temp;
				int max=0;
				int sum=0;
				double avg=0;
				for(int i=0; i<scores.length; i++) {
					temp = scores[i];
					sum += scores[i];
					if(temp>max) {
						max = temp;
					}
				}
				avg = (double)sum / scores.length;
				
				System.out.println("�ְ� ����: "+sum);
				System.out.println("��� ����: "+avg);
			}
			else if(selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("���α׷� ����");

	}

}
