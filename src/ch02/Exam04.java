package ch02;

public class Exam04 {

	public static void main(String[] args) {
		
		//���ڿ� => ����(����, �Ǽ�)
		
		//���ڿ��� String Ÿ�� ������ �����Ѵ�.
		String var1 = "10"; //10�� �ƴ϶� 1 �� 0 ��
		
		System.out.println("var1: "+ var1);

		//���ڿ��� ���ڰ� + �����ϸ� ���ڿ� ������ ��
		String var2 = var1 + 5; // 1 0 5
		System.out.println("var2: "+ var2);
		
		//���ڿ��� ������ ��ȯ�ؼ� ����
		int var3 = Integer.parseInt(var1) + 5;
		System.out.println("var3: "+ var3);
		
		//���ڿ��� �Ǽ��� ��ȯ�ؼ� ����
		String var4 = "10.5";
		double var5 = Double.parseDouble(var4) + 2.3;
		System.out.println("var4: "+ var5);
		
		//���ڸ� ���ڿ��� ��ȯ
		int var6 = 3;
		String var7 = "" + var6;//3�� ���ڿ� 3���� ����¹��1
		String var8 = String.valueOf(var6);//��� 2
		System.out.println("var7: "+ var7);
	}

}
