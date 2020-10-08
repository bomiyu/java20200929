package chap05.textbook;

public class ArrayCreateByValueListExample2 {
	public static void main(String[] args) {
		int[] scores; // 변수선언
		scores = new int[] { 83, 90, 87 }; // scores라는 변수에 값을 저장 할당연산자에의해 할당됨
		int sum1 = 0;// int 타입이므로 0으로 초기화 시킴
		for (int i = 0; i < 3; i++) { // 인덱스 0 1 2 sum += 으로 for문 돌면서 더하여 할당
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);

//		리턴된 총합을 sum2에 저장

		int sum2 = add(new int[] { 83, 90, 87 }); // 오른쪽을 왼쪽에 할당 오른쪽값은 함수(메소드)를 호출한 것
		System.out.println("총합 : " + sum2);
		System.out.println();

		int sum3 = add(new int[] { 1, 2, 3 });
		System.out.println(sum3);
	}

	public static int add(int[] scores) { // int[] scores파라미터를 받도록 정의
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		return sum;
	}
}
