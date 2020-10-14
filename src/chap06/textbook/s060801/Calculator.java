package chap06.textbook.s060801;

public class Calculator {

	//메소드
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	int plus(int x, int y) {//메소드명 앞에 타입명시 return키워드를 항상 만나도록 작성 해야하고 result의 타입이 각 메소드의 타입 여야함 
		int result = x+y;
		return result;
	}
	
	double divide(double x, double y) {
		double result = (double)x / (double)y;
		return result;
		
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}
