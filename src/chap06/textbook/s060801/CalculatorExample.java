package chap06.textbook.s060801;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();// 설계도에 작성된 4개의 메소드
		myCalc.powerOn();

		int result1 = myCalc.plus(5, 6);
		System.out.println("result1: " + result1);

		double x = 10.0;
		double y = 4.0;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2: " + result2);
		myCalc.powerOff();

	}
}
