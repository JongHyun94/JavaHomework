package ch12.exam01;

public class MusicTask implements Runnable{
	@Override
	public void run() {
		while(true) {
			System.out.println("À½¾ÇÀ» Á¦¼Ä ÇÕ´Ï´Ù.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		
	}
}
