package chap05;

public class ArrayEx01 {
	public static void main(String[] args) {
		int i1 = 30;
		int i2 = 50;
		int i3 = 20;
		int i4 = 70;
		// 여러값을 한꺼번에 저장하고싶을때 배열을 씀

		int[] arr1;// arr1은 int여러개 저장가능 integer배열타입~:참조타입~!
		arr1 = new int[3];// 저장공간을 new라는 타입과 몇개 저장할지 명시 new라는 타입으로 저장공간heap에 생기고 그안에 3개의 공간이 생김

		System.out.println(arr1[0]);// 0번인덱스 출력하여 확인
		System.out.println(arr1[1]);// 1번인덱스 출력 확인
		System.out.println(arr1[2]);
//		System.out.println(arr1[3]);//오류 0번인덱스부터 시작이므로 3번arr1은 존재하지않음

		arr1[0] = 99;
		arr1[1] = 88;
		arr1[2] = 77;
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
		int[] arr2;
		arr2 = arr1; //2 가 1의 값을 가지려고함
		arr2[0] =55; 
		
		System.out.println(arr2[0]);
		System.out.println(arr1[0]);
	}
}
