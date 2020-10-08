package chap04.exercises;

public class Exercise05 {
	public static void main(String[] args) {
//		중첩for문을 사용 방정식 4x + 5y = 60의 모든 해(x,y)로 출력 단,x와y는 10이하의 자연수 
//		1, 1확인
//		1, 2확인
//		1, 3확인
//		  :
//		1, 10
//		2, 1
//		2, 2
//		10,10 모두 확인할예정임

		for (int x = 1; x <= 10; x++) { //
			for (int y = 1; y <= 10; y++) {
				if (((4 * x) + (5 * y)) == 60) {
					System.out.println("(" + x + "," + y + ")");

				}
			}
		}

	}
}
