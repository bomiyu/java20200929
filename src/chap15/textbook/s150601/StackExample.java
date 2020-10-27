package chap15.textbook.s150601;

import java.util.*;

public class StackExample {
	public static void main(String[] args) {
		//LIFO (Last In Fist Out)
		Stack<Coin> coinBox = new Stack<>();

		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));

		while (!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전:" + coin.getValue() + "원");
		}
	}
}
