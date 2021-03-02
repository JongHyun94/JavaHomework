package ch11.exam02;

public class Member {
	private String id;
	private String name;
	public Member(String id, String name) {
		//super(); //생략 가능
		this.id = id;
		this.name = name;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m = (Member) obj; //강제 타입 변환
			if(id.equals(m.id)&&name.equals(m.name)) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	@Override
	public String toString() {
		
		return id+": " + this.name;
	}
}
