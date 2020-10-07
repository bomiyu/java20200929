package chap04.textbook;

public class WhileSumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;

		int i = 1;

		while (i <= 100) {
			sum += i;
			i++;
		}

		System.out.println("1~" + (i - 1) + " 합 : " + sum); //총 101까지 while문 실행하기때문에 (i-1)
	}
}
