package ch18.exam13;

import java.io.Console;

public class Example {

	public static void main(String[] args) {
		Console console = System.console();
		
		System.out.print("���̵�");
		String id = console.readLine();
		System.out.println("��й�ȣ");
		String password = new String(console.readPassword()); //char �迭�� �ٷ� �����ߵ�
		System.out.println(id);
		System.out.println(password);

	}

}
