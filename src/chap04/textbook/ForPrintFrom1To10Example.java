package chap04.textbook;

public class ForPrintFrom1To10Example {
	public static void main(String[] args) {
		//1-> 2-> code-> 3-> 2
		
		//1~10
		
		System.out.println("========1~10=========");
		for (int i = 1; i <=10; i++) {
			System.out.println(i);
		}
		
		//11~20
		System.out.println("========11~20=========");
		for (int j=11; j <=20; j++) {
			System.out.println(j);
		}
		//1~9 홀수
		System.out.println("========1~9 홀수=========");
		for (int k = 1; k <=10; k+=2) {
			System.out.println(k);
		}
		//10~1
		System.out.println("========10~1=========");
		for (int l = 10; l >= 1; l--) {
			if(l > 0) {
			System.out.println(l);}
		}
		//10~2 짝수
		System.out.println("========10~1짝수=========");
		for (int q = 10; q >=1; q-=2) {
			if(q+1 > 0) {
			System.out.println(q);}
		}
	}
}
