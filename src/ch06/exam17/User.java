package ch06.exam17;

public class User {
	private String id;
	private String name;
	private String password;
	private int age;
	private boolean adult;
	
	/*
	
	public void setAge(int age) {
		if(age < 0) {
			this.age = 0;
		}
		else {
			this.age=age;
		}
	}
	public int getAge() {
		return age;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	*/
	
	public void setAdult (boolean adult) {
		this.adult = adult;
	}
	public boolean isAudlt() {
		return adult;
	}
}
