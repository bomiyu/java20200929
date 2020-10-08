package chap05.Exercises;

import java.util.Scanner;

public class Exercise9Scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("입력>");
		String str = scanner.nextLine();//엔터치기전까지의 문자열을 담음
		int val = Integer.valueOf(str);//더블,boolean으로도 변경 가능//str을 정수변수에 넣음 //받아서 변경하는코드임
		
		System.out.println("출력>");
		System.out.println(str);
		System.out.println(val);
		
		System.out.println("정수입력");
		val = scanner.nextInt();//입력받은 값을 정수를 바로리턴 해줌
		
		System.out.println("정수 출력");
		System.out.println(val);
	}
}
