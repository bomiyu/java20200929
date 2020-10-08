package chap05;

public class ArrayEx02 {
	public static void main(String[] args) {
		int[] arr1 = new int[3];// 배열공간만들어서 아래 각 arr1인덱스에 할당
		arr1[0] = 99;
		arr1[1] = 77;
		arr1[2] = 55;

		int[] arr2 = new int[] { 88, 66, 44 };
		for (int i = 0; i < 3; i++) { // 0 1 2번째 인덱스 
			System.out.println(arr2[i]);
		}

		double[] arr3 = new double[] { 3.14, 6.5, 9.9 };
		for (int i = 0; i < 3; i++) {
			System.out.println(arr3[i]);
		}

		String[] arr4 = new String[] { "java", "css", "html", "jquery" };
		for (int i = 0; i < 3; i++) {
			System.out.println(arr4[i]);
		}
	}
}
