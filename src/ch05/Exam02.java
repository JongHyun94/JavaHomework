package ch05;

import java.util.Arrays;

public class Exam02 {

	public static void main(String[] args) {
		// ������ �����ϸ鼭 �� ����� ������ ���
		int[] scores1 = {90,85,95};
		System.out.println(scores1[0]);
		System.out.println(scores1[1]);
		System.out.println(scores1[2]);
		// ������ ������ �� �� ����� ������ ���
		int[] scores2 = null;
		//scores2 = {90,85,95}; // �ȵ�
		scores2 = new int[] {90,85,95};
		
		//add(10); // call by value : ���� �����ϸ鼭 ȣ��
		add(scores1); // call by reference : ������ �����ϸ鼭 ȣ��
		add(new int[] {100,200,300}); // ���� ����� �ְ� �迭�� �����ߵ�. �̹� ����� �迭 int[] arr �� �ֱ⶧����
	}
	/*
	public static void add(int value) {
		System.out.println("��:"+value);
	}
	*/
	public static void add(int[] arr) {
		System.out.println("��:"+Arrays.toString(arr)); // �������� �� ���ڿ��� �ٲ��ִ� �޼ҵ�
	}

}
