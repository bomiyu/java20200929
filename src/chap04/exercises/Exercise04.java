package chap04.exercises;

public class Exercise04 {
	public static void main(String[] args) {

		while (true) {
			int nun1 = (int) (Math.random() * 6 + 1);// 1~6까지 하나 랜덤으로 뽑는다
			int nun2 = (int) (Math.random() * 6 + 1);// 1~6까지 하나 랜덤으로 뽑는다
			System.out.println("(" + nun1 + ", " + nun2 + ")");

			int sum = nun1 + nun2;

			if (sum == 5) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
