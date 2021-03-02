package ch15.exam08;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Example {

	public static void main(String[] args) {
		//인터페이스라면 익명 구현 객체, // 클래스라면 상속해서 자식을 객체로 만듬
		TreeSet<Product> set = new TreeSet<>(new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				if(o1.price<o2.price) {
					return -1;
				}
				else if(o1.price==o2.price) {
					return 0;
				}
				else {
					return 1;
				}
			}
		});
		set.add(new Product("TV",10000));
		set.add(new Product("Audio",5000));
		set.add(new Product("Car",12000));

		for(Product p : set) {
			System.out.println(p.name+", " +p.price); //그냥 실행하면 비교하는 문이 없어서 안나옴
		}
		
		TreeMap<Product, String> map = new TreeMap<>(new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				if(o1.price<o2.price) {
					return -1;
				}
				else if(o1.price==o2.price) {
					return 0;
				}
				else {
					return 1;
				}
			}
		});
		map.put(new Product("TV",10000),"LG");
		map.put(new Product("Audio",5000),"Samsung");
		map.put(new Product("Car",12000),"Hyundai");
		
		Set<Product> pset = map.keySet();
		for(Product p : pset) {
			System.out.println(p.name+", " +p.price+", "+map.get(p));
		}
		
	}

}
