package ch15.exam03;

import java.util.HashSet;
import java.util.Set;

public class Example2 {

	public static void main(String[] args) {
		Set<User> set = new HashSet<User>();
		
		User user = new User("winter","�Ѱܿ�");
		User user1 = new User("winter","�Ѱܿ�");
		
		set.add(user);
		set.add(user1);  //�ϳ��� �����
		
		System.out.println(user.hashCode() == user1.hashCode()); //��ü�� ���� �ĺ��ڵ尡�ִµ� �װ� hashcode��
		System.out.println(user.equals(user1));
		System.out.println(set.size());

	}

}
