package chap05;

public class ArrayCopyEx02 {
	public static void main(String[] args) {
		int[][] arr1 = { { 3, 4 }, { 88, 99 }, { 2, 1 } };
		int[][] arr2 = new int[arr1.length][];

		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i]; // arr1의 배열들의 참조값을 복사
		}

		arr1[0][0] = 100; // 복사한 다음에 arr1중에 3을 100으로 변경 했으므로 arr2에도 참조번지가 같으니 100으로 같음
							// 얕은복사라고도 함
		
		
		for (int[] arr : arr2) {
			for (int n : arr) { // 각각 원소 갯수만큼 두번돌고~
				System.out.println(n);
			}
		}
	}
}
