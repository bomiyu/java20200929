package chap06.textbook.exercises.p18;

import chap06.textbook.s061005.Singleton;

public class ShopService {
		private final static ShopService singleton = new ShopService();
		
		private ShopService() {
			
		}
		
		static ShopService getInstance() {
			return singleton;
		}
	}

