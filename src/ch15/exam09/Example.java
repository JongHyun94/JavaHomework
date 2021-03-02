package ch15.exam09;

import java.util.Stack;

public class Example {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		stack.push("홍길동");
		stack.push("홍길서");
		stack.push("홍길남");
		
		/*
		 * for(String name : stack) { System.out.println(name); }
		 */
		
		while(!stack.empty()) { //비어있는지 확인
			String item = stack.pop();
			System.out.println(item);
		}
	}

}
