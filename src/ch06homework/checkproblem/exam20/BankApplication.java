package ch06homework.checkproblem.exam20;

import java.util.Scanner;

public class BankApplication {

	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {

		boolean run = true;
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("-----------------------------------------");
			System.out.print("<����>");
			
			int selectNo = scanner.nextInt();
			
			switch (selectNo) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				run = false;
				break;
			}
		}
		System.out.println("���α׷� ����");
	}
	
	private static void createAccount() {
		System.out.println("-----");
		System.out.println("���»���");
		System.out.println("-----");
		System.out.print("���¹�ȣ : ");
		String ano = scanner.next();
		scanner.nextLine();
		System.out.print("������ : ");
		String owner = scanner.next();
		scanner.nextLine();
		System.out.print("�ʱ��Աݾ� : ");
		int balance = scanner.nextInt();
		
		Account newAccount = new Account(ano, owner, balance);
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("��� : ���°� �����Ǿ����ϴ�.");
				break;
			}
		}
	}
	
	private static void accountList() {
		System.out.println("-----");
		System.out.println("���¸��");
		System.out.println("-----");
		for(int i=0;i<accountArray.length;i++){
			Account account = accountArray[i];
			if(account != null) {
				System.out.print(account.getAno());
				System.out.print("    ");
				System.out.print(account.getOwner());
				System.out.print("    ");
				System.out.println(account.getBalance());
				System.out.print("    ");
				System.out.println();
			}
		}
	}
	
	private static void deposit() {
		System.out.println("-----");
		System.out.println("����");
		System.out.println("-----");
		System.out.print("���¹�ȣ : ");
		String ano = scanner.next();
		scanner.nextLine();
		System.out.print("���ݾ� : ");
		int balance = scanner.nextInt();
		scanner.nextLine();
		Account account = findAccount(ano);
		
		if(account==null) {
			System.out.println("�ش� ���¹�ȣ�� �����ϴ�.");
			return;
		}
		account.setBalance(account.getBalance()+balance);
		System.out.println("��� : ������ �����Ǿ����ϴ�.");
	}
	
	private static void withdraw() {
		System.out.println("-----");
		System.out.println("���");
		System.out.println("-----");
		System.out.print("���¹�ȣ : ");
		String ano = scanner.next();
		scanner.nextLine();
		System.out.print("���ݾ� : ");
		int balance = scanner.nextInt();
		scanner.nextLine();
		
		Account account = findAccount(ano);
		
		if(account==null) {
			System.out.println("�ش� ���¹�ȣ�� �����ϴ�.");
			return;
		}
		
		account.setBalance(account.getBalance()-balance);
		System.out.println("��� : ����� �����Ǿ����ϴ�.");
	}
	
	private static Account findAccount(String ano) {
		Account account = null;
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i] != null) {
				String useAno = accountArray[i].getAno();
				if(useAno.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}
}