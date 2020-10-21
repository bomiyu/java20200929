package chap08.textbook.s080503;

import chap08.textbook.s080502.HankookTire;
import chap08.textbook.s080502.Tire;

public class Car {
	Tire[] tires = { new HankookTire(), new HankookTire(), new HankookTire(), new HankookTire()

	};

	void run() {
		for (Tire tire : tires) { // 배열이니까 코드블록 돌때 각원소가 한번씩 차례대로들어감 1번째 코드 한번돌고 2번째 돌고~~ (향상된 for문)
			tire.roll();

		}
	}
}
