package chap04.textbook;

public class IfExample {
	public static void main(String[] args) {
		int score = 93;

		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A입니다");

		}

		if (score < 90) {
			System.out.println("점수가 90보다 작습니다");
			System.out.println("등급은 B입니다");
		} // 중괄호 꼭 있어야함 없으면 ("등급은 B입니다")실행됨_if문과 관련이 없어짐
	}
}
