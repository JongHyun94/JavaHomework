package ch06.exam15.pack2;

import java.util.Date;

import ch06.exam15.pack1.Board; // 다른 패키지에서 가져와서 사용 가능
import ch06.exam15.pack1.Product;

public class Example {

	public static void main(String[] args) {
		Board b1 = new Board();
		b1.title = "제목1";
		
		Product p1 = new Product();
		p1.name = "세탁기";

		Date now = new Date();
		
		ch06.exam15.pack3.Board b2 = new ch06.exam15.pack3.Board(); // 전체이름
	}

}
