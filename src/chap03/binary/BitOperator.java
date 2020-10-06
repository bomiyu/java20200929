package chap03.binary;

public class BitOperator {
	public static void main(String[] args) {
//		~ 반전(단항)
		int i = 10;
		int j = ~i;
		System.out.println(j); //-11

//		 이항
//		 & and : 같은 자리의 bit가 1인 경우만 1, 나머지 0
//		 | or : 같은 자리의 bit가 0인 경우만 0, 나머지 1
//		 ^ xor : 같은 자리의 bit가 다를 경우 1, 같으면 0
//		 피연산자 : integer
//		 결과 : integer
		int a = 45;
		int b = 25;
		int c = a & b;
		System.out.println(c); //9
		
		c = a | b;
		System.out.println(c); //61
		
//		bit shift 연산자
//		<< : 각 bit를 왼쪽으로 옮김
//		>> : 각 bit를 오른쪽으로 옮김, 왼쪽은 msb(Most Significant Bit) 최상위 비트로 채움 _음수는 1로채우로 양수는 0으로채우고~! 
//		>>> : 각 bit를 오른쪽으로 옮김, 왼쪽은 0으로 채움
		
		
		int val = 1; 
		int res = val << 3; //8을 곱한것과 같음 8
		System.out.println(res);
		
		val = 98;
		res = val >> 2; //4로 나눈값과 같음 24
		System.out.println(res);
		
		val = -17;
		res = val >> 2;
		System.out.println(res);
		
		val = 98;
		res = val >>> 2;
		System.out.println(res);
		
		val = -17;
		res = val >>> 1;
		System.out.println(res);
		
	}
}
