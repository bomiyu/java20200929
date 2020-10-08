package chap05;

public class ArrayEx03 {
	public static void main(String[] args) {
		int a = mymethod(3);// 함수 실행결과는 0으로 리턴받음 메소드는 값만 잘 받으면됨
		System.out.println(a);// 출력

		a = mymethod(4);
		System.out.println(a);

		a = mymethod(50);
		System.out.println(a);

		int[] arr1 = new int[] { 9, 8, 7 };
		a = mymethod2(arr1); // 호출
		System.out.println(a);
		
		int[] arr2 = new int[] {99, 88, 77};
		a = mymethod2(arr2);  //같은 타입을 사용할때는 마지막 블록 실행
		System.out.println(a);
		
		a = mymethod2(new int[] {22, 33, 44});
		System.out.println(a);
		
	}

	public static int mymethod2(int[] arr) { // 파라미터를 배열로 받는다
		System.out.println("-------mymethod2 시작--------");
		int sum = 0;
		for (int i = 0; i < 3; i++) {
//			System.out.println(arr[i]);
			sum += arr[i];
		}

		System.out.println("-------mymethod2 종료--------");
		return sum;

	}

	public static int mymethod(int i) {// 리턴타입int, 메소드명, 파라미터, //컴파일오류없으려면 return을 일단 블록에 씀

		return i * 2;

	}
}
