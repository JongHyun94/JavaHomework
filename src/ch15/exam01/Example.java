package ch15.exam01;

import java.util.List;
import java.util.ArrayList;

public class Example {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();   //<> generic Ÿ�� : ���� Ÿ���� �̸� ��������
		//��ü ����
		list.add("hong");
		list.add("3");
		list.add("new Board()");
		System.out.println(list.size());

		//��ü ���
		String name = list.get(0); //return Ÿ���� generic �� �ִ� Ÿ������ �ٲ� ������ obj
		String value = list.get(1); 
		String board = list.get(2);
		
		
		
		//��ü ����
		list.remove(0);
		list.remove(0);
		System.out.println(list.size());
		
		
		
	}

}
