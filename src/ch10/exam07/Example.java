package ch10.exam07;

public class Example {

	public static void main(String[] args) {
		
		try {
			method();
		}
		catch(Exception e) {
			//���� �޽������� ����ó���� �� �� ���
			String message = e.getMessage();
			
			//������� �� ����ϴ� ���� ����
			System.out.println(e.toString()); //ch10.exam07.NoAccountException: 0001: �Ա� ���°� ����
			e.printStackTrace();
			/*		if(message.contains("0001")) {
						
					}*/
		}
	}
	public static void method() throws NoAccountException {
		throw new NoAccountException("0001: �Ա� ���°� ����");
	}

}
