package chap04.textbook;

public class WhilePrintFrom1To10Example {
	public static void main(String[] args) {
		// 1~10
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		// 11~20
		System.out.println("--------------------------------------");
		int j = 11;
		while (j <= 20) {
			System.out.println(j);
			j++;
		}
		// 1~9홀수만
		System.out.println("--------------------------------------");
		int k = 1;
		while (k <= 10) {
			System.out.println(k);
			k += 2;
		}
		// 10~1
		System.out.println("--------------------------------------");
		int l = 10;
		while (l >= 1) {
			System.out.println(l);
			l--;
		}
		// 10~2짝수만
		System.out.println("--------------------------------------");
		int n = 10;
		while (n >= 1) {
			System.out.println(n);
			n -= 2;
		}

	}
}
