package ch10.exam07;

public class Example {

	public static void main(String[] args) {
		
		try {
			method();
		}
		catch(Exception e) {
			//예외 메시지별로 예외처리를 할 때 사용
			String message = e.getMessage();
			
			//디버깅할 때 사용하는 예외 정보
			System.out.println(e.toString()); //ch10.exam07.NoAccountException: 0001: 입금 계좌가 없음
			e.printStackTrace();
			/*		if(message.contains("0001")) {
						
					}*/
		}
	}
	public static void method() throws NoAccountException {
		throw new NoAccountException("0001: 입금 계좌가 없음");
	}

}
