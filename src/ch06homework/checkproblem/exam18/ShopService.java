package ch06homework.checkproblem.exam18;

public class ShopService {
	private static ShopService shop = new ShopService();
	
	static ShopService getInstance() {
		ShopService s = new ShopService();
		return shop;
	}
}
