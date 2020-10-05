package chap03.ternary;

public class TernaryOperator {
	public static void main(String[] args) {
//		1항 ? 2항 : 3항
//		 a ? b : c
//		위 연산의결과는 b 또는 c // 1항결과true면 2항결과 false면 3항결과
		boolean a = true;
		int b = 3;
		int c = 5;
		
		System.out.println(a ? b : c);
		
	}
}
