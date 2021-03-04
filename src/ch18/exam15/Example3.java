package ch18.exam15;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Example3 {

	public static void main(String[] args) {
		File file = new File("C:/Temp");
		
		String[] list = file.list();
		for(String name : list) {
			System.out.println(name);
		}
		
		System.out.println();
		
		File[] files = file.listFiles();
		for(File f : files) {
			//System.out.println(f.lastModified());
			long time = f.lastModified();
			Date date = new Date(time);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
			System.out.print(sdf.format(date)+"\t");
			
			if(f.isDirectory()) {
				System.out.print("<dir>\t");
				
			}
			else {
				System.out.print(f.length()+"\t"); //������ ũ��
			}
			System.out.println(f.getName());
		}
	}

}
