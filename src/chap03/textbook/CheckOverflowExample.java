package chap03.textbook;

public class CheckOverflowExample {
	public static void main(String[] args) {
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result); //예외 발생할 수있는지 시도try 하여 발생할때만 catch실행 
		} catch (ArithmeticException e) {
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음");
		}
	}

	public static int safeAdd(int left, int right) {
		if ((right > 0)) {
			if (left > (Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생");

			}
		} else {
			if (left < (Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		}

		return left + right;
	}

}
//메소드가 두개일때 main메소드 부터 해석 