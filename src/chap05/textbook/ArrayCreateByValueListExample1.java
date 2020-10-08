package chap05.textbook;

public class ArrayCreateByValueListExample1 {
	public static void main(String[] args) {
		int[] scores = { 83, 90, 87 };

		System.out.println("scores[0]:" + scores[0]);
		System.out.println("scores[1]:" + scores[1]);
		System.out.println("scores[2]:" + scores[2]);

		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}

		System.out.println("총합:" + sum);
		double avg = (double) sum / 3; //평균이면 실수도 나올 수 있으니 double로 변환 하여 값을 산출
		System.out.println("평균=" + avg);
	}
}
