//��Ŭ���� �ֿܼ��� ����� �� �ִ� �Խ����� ����ÿ�.
//��� : ���, ����, �б�, ����, ����, ����
package TeamProject1;

//Scanner ��ü ����ϱ� ���� import
import java.util.Scanner;

public class BoardTeam {

	public static void main(String[] args) {
		// �۵� flag�� run���� ����. 
		boolean run = true;
		// string ��ü ����
		String[][] myBoard;
		myBoard = new String[100][5];
		Scanner scanner = new Scanner(System.in);
		
		/**
		 *  trueȯ�濡�� ��� �۵��ϸ鼭 �޴� ȭ�� ���, false ȯ�濡�� �۵� ����
		 */ 
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.��� | 2.���� | 3.�б� | 4.���� | 5.���� | 6. ����");
			System.out.println("--------------------------------------------");
			System.out.print("�޴� ����> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			/*
			 * 1. ��� ��� ���
			 */
			if(selectNo == 1) {
				
			}
			/*
			 * 2. ���� ��� 
			 */
			else if(selectNo == 2) {

			}
			/**
			 * 3. �б� ��� 
			 */
			else if(selectNo == 3) {
	
			}
			/**
			 * 4. ���� ���
			 */
			else if(selectNo == 4) {
				
			}
			/**
			 * 5. ���� ���
			 */
			else if(selectNo == 5) {
				
			}
			/**
			 * 6. ���� ��� run = true ���� -> false�� �ٲٱ� 
			 */
			else if(selectNo == 6) {
				run = false;
			}
		}
		
		System.out.println("���α׷� ����");

	}

}
