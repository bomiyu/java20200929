package chap03.textbook;

public class AccuracyExample1 {
	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;// 10을 곱하고 10을 다시 나눠서 사용~
		int number = 7;
		
		double result = apple - number*pieceUnit;
		
		System.out.println("사과 한개에서 ");
		System.out.println("0.7조각을 빼면, ");
		System.out.println(result + "조각이 남는다.");
				
	}
}
