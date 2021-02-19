package ch06.exam07;

public class BoardService {
	//Field
	int count;
	//Constructor
	
	//Method
	int getNewBno() {
		int newBno=++count;
		return newBno;
	}
	void save(String title, String content) {
		
		int bno = getNewBno();
		System.out.println(bno+" 을 저장합니다.");
		System.out.println(title+" 을 저장합니다.");
		System.out.println(content+" 를 저장합니다.");
	}
	int getBoards(int[] values) {
		int result=0;
		for(int value : values) {
			result += value;
		}
		return result;
	}
	int getSum(int ... values) {
		int result = 0;
		for(int value : values) {
			result += value;
		}
		return result;
	}
}
