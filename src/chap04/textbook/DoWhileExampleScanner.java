package chap04.textbook;

import java.util.Scanner;

public class DoWhileExampleScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//키보드를 스캔할 준비가 되었다
		
		System.out.println("입력");
		
		String line = scanner.nextLine();//입력 대기중 
		
		System.out.println("출력");
		System.out.println(line);
		
	}
}
