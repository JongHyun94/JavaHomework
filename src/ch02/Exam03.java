package ch02;

public class Exam03 {

	public static void main(String[] args) {
		
		//int Ÿ�� ������ �ǿ������� ������ ����� int��
		byte var1 = 10;
		byte var2 = 20;
		int var3 = var1 + var2;
		byte var4 = (byte)(var1 + var2);
		
		//int Ÿ�Ժ��� ū Ÿ���� ������ �Ǹ� ū Ÿ������ ����� �ȴ�.
		int var5 = 10;
		long var6 = 20;
		long var7 = var5 + var6;
		int var8 = (int)(var5 + var6);
		
		int var9 = 10;
		double var10 = 1.5;
		double var11 = var9 + var10;
	}

}
