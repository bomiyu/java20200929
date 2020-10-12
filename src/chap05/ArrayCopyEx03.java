package chap05;

public class ArrayCopyEx03 {
	public static void main(String[] args) {
		int[][] arr1 = { { 3, 4 }, { 88, 99 }, { 2, 1 } };
		int[][] arr2 = new int[arr1.length][];//arr1의 길이만큼 원소크기만큼 메모리 생성

		for (int i = 0; i < arr1.length; i++) {
			int[] newArr = new int[arr1[i].length];

			for (int j = 0; j < arr1[i].length; j++) {
				newArr[j] = arr1[i][j];// 각원소가 복사됨

			}

			arr2[i] = newArr;

		}
		
		arr1[0][0] = 100;

		for (int[] arr : arr2) {
			for (int n : arr) {
				System.out.println(n);
			}
		}
	}
}
