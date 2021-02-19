package ch06.exam07;

public class Example {
	
	public static void main(String[] args) {
		BoardService bs = new BoardService();
		
		int bno = bs.getNewBno();
		System.out.println(bno);
		
		bs.save("제목1", "내용1");
		bs.save("제목2", "내용2");
		
		int[] arr = {1,2,3};
		int sum = bs.getBoards(arr);
		System.out.println(sum);
	
		sum = bs.getBoards(new int[] {1,2,3,});
		System.out.println(sum);
		
		sum = bs.getSum (1,2,3);
		System.out.println(sum);
	}
	
}
