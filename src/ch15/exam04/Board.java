package ch15.exam04;

public class Board {
	private int bno;
	private String title;
	
	public Board(int n, String str) {
		setBno(n);
		setTitle(str);
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}
