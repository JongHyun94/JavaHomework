package ch15.exam04;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Example1 {
	public static void main(String[] args) {
		
		//Map��ü ����
		Map<String, String> map = new HashMap<>(); //�ߺ��̸� ��������
		
		//Entry ����
		map.put("name1", "ȫ�浿1");
		map.put("name2", "ȫ�浿2");
		map.put("name3", "ȫ�浿3");
		//map.put(2, new Date());	//�������� Ÿ���̱⿡ ���� �߻�
	
		System.out.println(map.size());
		
		//Entry ��������
		String s1 = map.get("name1");
		System.out.println(s1);
		
		//�ݺ� ó�� ���1
		Set<Entry<String, String>>set = map.entrySet();
		for(Entry<String, String> entry : set) {
			System.out.println(entry.getKey()+" : " +entry.getValue());
			
		}
		
		//�ݺ� ó�� ���2
		Set<String> set2 = map.keySet();
		for(String key : set2) {
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}
		
		//����
		map.remove("name1");
		map.clear();
	}
}
