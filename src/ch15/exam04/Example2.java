package ch15.exam04;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Example2 {
	public static void main(String[] args) {
		
		//Map객체 생성
		Map<User, Board> map = new HashMap<>(); //중복이면 생략가능
		
		//Entry 저장
		map.put(new User("winter","겨울비"), new Board(1,"겨울비"));
		map.put(new User("winter","봄돌이"), new Board(2,"입춘"));
	
		System.out.println(map.size());
		
		Board board = map.get(new User("winter",null));
		System.out.println(board.getBno());
		System.out.println(board.getTitle());
		
	}
}
