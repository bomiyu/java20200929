package chap04.textbook;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");

		Scanner scanner = new Scanner(System.in);
		String inputString;

		do {
			System.out.println(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while (!inputString.contentEquals("q")); // 일단 do 블록 실행 후 while조건확인 -true면 다시실행 

		System.out.println();
		System.out.println("프로그램 종료");
	}
}
