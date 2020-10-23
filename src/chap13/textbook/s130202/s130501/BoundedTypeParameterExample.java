package chap13.textbook.s130202.s130501;

import chap08.textbook.exercises.p03.Soundable;

public class BoundedTypeParameterExample {
	public static void main(String[] args) {
		// String str = Util.compare("a","b");

		int result1 = Util.compare(10, 20);
		System.out.println(result1);

		int result2 = Util.compare(4.5, 3);
		System.out.println(result2);

	}
}
