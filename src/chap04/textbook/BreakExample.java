package chap04.textbook;

public class BreakExample {
	public static void main(String[] args) {
		while (true) {
			int num = (int) (Math.random() * 6 + 1);//1~6까지 하나 랜덤으로 뽑는다 
			System.out.println(num);

			if (num == 6) {
				break;//6을만나면 실행종료
			}
		}
		System.out.println("프로그램 종료");
	}
}
