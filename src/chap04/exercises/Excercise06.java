package chap04.exercises;

public class Excercise06 {
	public static void main(String[] args) {
		// for문 이용 삼각형 출력하는 코드작성

		for (int i = 1; i <= 5; i++) {
			String n = "";
			for (int j = 1; j <= i; j++) {
				n += "*";
			
			}
			System.out.println(n);
		}

	}
}
