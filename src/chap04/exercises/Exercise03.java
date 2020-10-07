package chap04.exercises;

public class Exercise03 {
	public static void main(String[] args) {
		// 1~100까지의 정수 중에서 3의 배수의 총합 구하는 코드
		int sum = 0;

		
		for (int i = 1; i <= 100; i++) {
			if(i%3==0) {
			sum += i;
			}
			
		}
		System.out.println(sum);
	}

}