package ch10.exam06;

public class Example {

	public static void main(String[] args) {
		
		Account account = new Account();
		
		try{
			String ano = null;
			account.deposit(ano, 1000);
		}
		catch(NoAccountException e){
			System.out.println("계좌 번호가 없습니다.");
			System.out.println(e.getMessage());
		}
		
		String ano = "111-222-333";
		try {
			account.withdraw(ano, 1000);
			//System.out.println("출금 성공1");
			account.withdraw(ano, 10001);
			//System.out.println("출금 성공2");
		} catch (NoAccountException e) {  // 이건 RuntimeException이기 때문에 없어도 되지만 만들어주자
			
			System.out.println(e.getMessage());
		} catch (BalanceLackException e) {
			
			System.out.println(e.getMessage());
		}

	}

}
