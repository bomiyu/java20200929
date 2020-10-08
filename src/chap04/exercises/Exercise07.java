package chap04.exercises;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		boolean run = true;//while문을 실행하기 위해 boolean 타입 으로 true 

		int balance = 0; //잔고 초기화
		Scanner scanner = new Scanner(System.in); //스캔하기위해 Scanner객체 생성
		
		while (run) {
			System.out.println("------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");//4번을 false여야함 
			System.out.println("------------------");
			System.out.print("선택>");
			
			String c = scanner.nextLine(); //실행중이지만 입력 대기 중 

			
			switch (c) {
			case "1": 
				System.out.print("예금액>"); //1번입력 시 예금액> 출력
				String moneyStr1 = scanner.nextLine();//예금액출력 후 입력대기 해야하므로 .nextLine();메소드 써야함
				int money1 = Integer.valueOf(moneyStr1); //moneyStr1 입력값을 받고  string을 Integer로 변경~!
				balance = balance + money1;//잔고에 예금액추가
				break;
			case "2":
				System.out.print("출금액>");//2번입력 시 출금액> 출력
				String moneyStr2 = scanner.nextLine();
				int money2 = Integer.valueOf(moneyStr2);
				balance = balance - money2;
				break;
			case "3":
				System.out.println("잔고>" + balance); //잔고 출력
				break;
			case "4": 
				run = false; //run을 false시키면서 프로그램 종료시킴
				break;
				
			}
			
		}
		System.out.println("프로그램 종료");  //main안에 쓰임
	}
}








