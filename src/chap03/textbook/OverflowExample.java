package chap03.textbook;

public class OverflowExample {
	public static void main(String[] args) {
		long x = 1000000;
		long y = 1000000;
		long z = x * y;  //int로 변수 저장시 integer에 저장할수 있는 값의 크기가 넘어가서 해당값이 나오지 않음 long사용
		System.out.println(z);
	}
}
