package ch06.exam08;

public class Example {
	
	public static void main(String[] args) {
		BoardService bs;
		bs = new BoardService(100,5);
		
		bs.create("ab", "bc", "cd", 3);
		bs.create("44", "32", "121", 1);
		//bs.showList();
		
		String[] board = bs.read(2);
		for(String value:board) {
			System.out.print(value + "\t");
		}

	}
	
}
