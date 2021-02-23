package ch08.exam02;

public class Television implements RemoteControl{
	private int volume;
	
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}
	public void setVolume(int volume) {
		if(volume<RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
		}
		else if(volume>RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		}
		else {
			System.out.println("TV ������ "+volume+"�� �����մϴ�.");
			this.volume=volume;
		}
	}
}
