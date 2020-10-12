package chap05;

public class EnhancedFor {
	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 7, 8 };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);// 0번인덱스부터 마지막 인덱스 까지
		}

		System.out.println("----------------------------");

		for (int n : arr) { // 0번 인덱스를 n에 할당해서 실행 1번 인덱스를 n에 할당해서 실행~ 마지막 까지 반복
			System.out.println(n);

		}
	}
}
