package ch05homework;
//�־��� �迭�� �׸񿡼� �ִ밪�� ���غ�����(for���� �̿��ϼ���.)
public class Exercise07 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = {1,5,3,8,2};
		int temp;
		// �ִ밪 ã��
		
		for(int i=0;i<array.length;i++) {
			temp = array[i];
			if(temp>max) {
				max = temp;
			}
		}
		
		System.out.println("max: " + max);

	}

}
