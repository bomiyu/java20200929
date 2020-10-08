package chap04.exercises;

public class Exercise04 {
	public static void main(String[] args) {

		while (true) {//계속 실행시키다가(while에 조건이 true로 설정) 끝내길원해서while문 필요
			int nun1 = (int) (Math.random() * 6 + 1);// 1~6까지 하나 랜덤으로 뽑는다 int캐스팅~
			int nun2 = (int) (Math.random() * 6 + 1);// 1~6까지 하나 랜덤으로 뽑는다
			System.out.println("(" + nun1 + ", " + nun2 + ")"); //출력 실행시킬때마다 ~ 

			int sum = nun1 + nun2;

			if (sum == 5) {
				break; //코드 종료시킴
			}
		}
		System.out.println("프로그램 종료");
	}

}
