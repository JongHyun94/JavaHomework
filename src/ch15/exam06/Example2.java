package ch15.exam06;


import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Example2 {

	public static void main(String[] args) {
		
		TreeMap<String,String> map = new TreeMap<String,String>();
		
		map.put("s1","go gil dong");
		map.put("s3","Kimchi");
		map.put("s4","Park ji sung");
		map.put("s2","Aark ji sung");
		map.put("s5","Drama");
		//저장될때 정렬이됨. 오름차순 정렬
		
		Set<String> keys = map.keySet();
		
		for(String key : keys) { 
			System.out.println(key +" : " + map.get(key));
		}
		System.out.println();
		//내림 차순 정렬
		keys = map.descendingKeySet();
		for(String key : keys) {
			System.out.println(key +" : " + map.get(key));
		}
		System.out.println();
		//subMap
		Map<String,String> smap = map.subMap("s1", false, "s5", false);
		keys = smap.keySet();
		for(String key : keys) {
			System.out.println(key +" : " + map.get(key));
		}
		
	}

}
