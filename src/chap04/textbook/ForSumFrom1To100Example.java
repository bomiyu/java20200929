package chap04.textbook;

public class ForSumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;
		
		int i = 1;  //for문안에서 생략하고 밖에서 사용가능
		for (; i <= 100; i++) { //int i는 해당 코드블록 내에서만 쓸수있음
			sum += i; //100 일때까지 실행됨 //sum은 0부터 시작했지만 1더해져서 합해지고 저장하고~~~
//			System.out.println(i);
		}
//		System.out.println(i);
		System.out.println("1~"+ (i-1) + "합: " + sum);
	}
}
