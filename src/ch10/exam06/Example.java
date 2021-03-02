package ch10.exam06;

public class Example {

	public static void main(String[] args) {
		
		Account account = new Account();
		
		try{
			String ano = null;
			account.deposit(ano, 1000);
		}
		catch(NoAccountException e){
			System.out.println("���� ��ȣ�� �����ϴ�.");
			System.out.println(e.getMessage());
		}
		
		String ano = "111-222-333";
		try {
			account.withdraw(ano, 1000);
			//System.out.println("��� ����1");
			account.withdraw(ano, 10001);
			//System.out.println("��� ����2");
		} catch (NoAccountException e) {  // �̰� RuntimeException�̱� ������ ��� ������ ���������
			
			System.out.println(e.getMessage());
		} catch (BalanceLackException e) {
			
			System.out.println(e.getMessage());
		}

	}

}
