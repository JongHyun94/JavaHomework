package ch05;

public class Exam12 {

	public static void main(String[] args) {
		/*
		String season = "����";
		Season season1 = Season.SUMMER;
		*/
		
		Season nowSeason = Season.WINTER;
		if(nowSeason == Season.SUMMER) {
			System.out.println("�½��ϴ�.");
		}
		else {
			System.out.println("�ƴմϴ�.");
		}
		
		System.out.println(nowSeason); //��¿����� ����� ����.
		
		
		//String loginResult = "IDƲ��"; // �̷������� ��������
		// ������ ������ �������� boolean�� ���� Ȱ��
		LoginResult loginResult = LoginResult.FAILURE_ID;
		if(loginResult == LoginResult.SUCCESS) {
			System.out.println("�α��� ����");
		}
		else if(loginResult == LoginResult.FAILURE_ID) {
			System.out.println("���̵� �ٽ� �Է��ϼ���");
		}
		else {
			System.out.println("�н����� �ٽ� �Է��ϼ���");
		}
		
	}

}
