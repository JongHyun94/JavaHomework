package ch05;

import java.util.Arrays;

public class Exam08 {

	public static void main(String[] args) {
		
		int[][] scores = {   // scores�� �����ϴ� ���� 3�� 
				{10,20},     // scores[0]�� �����ϴ� ���� 2��
				{15,25,35},  // scores[1]�� �����ϴ� ���� 3��
				{45,55,65,75}// scores[2]�� �����ϴ� ���� 4��
		};
		
		System.out.println(scores.length);    //3
		System.out.println(scores[0].length); //2
		System.out.println(scores[1].length); //3
		System.out.println(scores[2].length); //4

		int sum = 0;
		int count = 0;
		for(int i=0; i<scores.length; i++) {
			for(int k=0; k<scores[i].length; k++) {
				sum += scores[i][k];
				count++;
			}
		}
		double avg = (double) sum / count;
		System.out.println("avg: " + avg);
	}
	
}
