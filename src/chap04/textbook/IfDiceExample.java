package chap04.textbook;

public class IfDiceExample {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 6) + 1; //랜덤한 값이 나옴  Math.random(): 0과1사이의 값 
		//(Math.random() * 6) 아래와 같음 
		// 0<=random <1 
		// 0*6 <=random*6 <1*6 

		if (num == 1) {
			System.out.println("1번이 나왔습니다");
		} else if (num == 2) {
			System.out.println("2번이 나왔습니다");
		} else if (num == 3) {
			System.out.println("3번이 나왔습니다");
		} else if (num == 4) {
			System.out.println("4번이 나왔습니다");
		} else if (num == 5) {
			System.out.println("5번이 나왔습니다");
		} else {
			System.out.println("6번이 나왔습니다");
		}
	}
}
