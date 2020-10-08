package chap05.textbook;

public class ArrayCreateByNewExample {
	public static void main(String[] args) {
		int[] arr1 = new int[3];// 3개의 int
		for (int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "]:" + arr1[i]); // i를 0 1 2로 바꿔가면서 출력~
		}
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for (int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}

		double[] arr2 = new double[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "]: " + arr2[i]);
		}

		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;

		for (int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "] :" + arr2[i]);
		}

		String[] arr3 = new String[3];// 스트링 참조타입~null이라는 키워드!
		for (int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "]: " + arr3[i]);
		}

		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		for (int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "]:" + arr3[i]);
		}

	}
}
