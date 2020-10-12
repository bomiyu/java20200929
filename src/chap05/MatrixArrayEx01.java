package chap05;

public class MatrixArrayEx01 {
	public static void main(String[] args) {
		int[][] matrix = new int[3][2]; // 인티저 배열을 저장하는 배열 //갯수로 쓰는것

		int[] arr = new int[3];// 인티저를 저장하는 배열 //0이 들어있는 배열이 생성
		System.out.println(arr.length);

		System.out.println(matrix[0].length); // matrix는 배열을 저장한 배열이니까 원소는 배열~! 길이는 2
		System.out.println(matrix[1].length); // 길이는 2
		System.out.println(matrix[2].length); // 길이는 2

		arr[0] = 99;
		arr[1] = 88;
		arr[2] = 77;

		matrix[0][0] = 9;// 갯수번호로 쓰는것
		matrix[2][0] = 1;

//		matrix[2][2] = 2;
//		 matrix[3][0] = 2;

	}
}
