package ch05;

import java.util.Arrays;

public class Exam03 {

	public static void main(String[] args) {
		
		int[] scores1 = {90,85,95}; //Stack������ scores1, scores2, scores3�� ����
		int[] scores2 = {90,85,95}; //heap�� ����ִ� 90 85 95 ���� �ּҰ��� �ٸ� ��ü�� ������
		int[] scores3 = scores1;    //scores1�� �ּҰ��� scores3�� �����
		
		System.out.println(scores1 == scores2);
		System.out.println(scores1 == scores3);

	}

}
