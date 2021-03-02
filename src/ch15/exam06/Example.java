package ch15.exam06;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Example {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("go gil dong");
		set.add("Kimchi");
		set.add("Park ji sung");
		set.add("Aark ji sung");
		//����ɶ� �����̵�. �������� ����
		
		for(String item : set) { 
			System.out.println(item);
		}
		System.out.println();
		//���� ���� ����
		NavigableSet<String> nset = set.descendingSet();
		
		for(String item : nset) { 
			System.out.println(item);
		}
		System.out.println();
		
		//subset
		NavigableSet<String> sset = set.subSet("A",false,"Park ji sung",true); //false ������ true ����
		
		for(String item : sset) { 
			System.out.println(item);
		}
		
		
	}

}
