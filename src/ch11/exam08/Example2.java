package ch11.exam08;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Example2 {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance(); //바로 new 못쓰는 이유는 protected 여서 부모로써만 사용가능 singleton 방식
												// 외부에서 객체 생성 불가
		
		int year = now.get(Calendar.YEAR);          //년
		int month = now.get(Calendar.MONTH)+1;    //월
		int date = now.get(Calendar.DAY_OF_MONTH);  //일
		int day = now.get(Calendar.DAY_OF_WEEK);    //요일
		int amPm = now.get(Calendar.AM_PM);         //AM PM
		int hour = now.get(Calendar.HOUR_OF_DAY);   //시간
		int minute = now.get(Calendar.MINUTE);      //분
		int second = now.get(Calendar.SECOND);      //초
		
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
		System.out.println(day);
		System.out.println(amPm);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
	}

}
