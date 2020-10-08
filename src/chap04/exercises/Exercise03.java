package chap04.exercises;

public class Exercise03 {
	public static void main(String[] args) {
		// 1~100까지의 정수 중에서 3의 배수의 총합 구하는 코드
		int sum = 0;

		for (int i = 1; i <= 100; i++) { //1씩증가시키면서 반환하면서 실행
			if(i%3==0) { //조건 추가~ 3으로 나누고 나머지가 0이면= 3의배수이면~
			sum += i;
			}
			
		}
		System.out.println(sum);
	}

}