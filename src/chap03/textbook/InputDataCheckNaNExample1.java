package chap03.textbook;

public class InputDataCheckNaNExample1 {
	public static void main(String[] args) {
		String input = "3.14";
		double v = Double.valueOf(input);//기본,참조타입끼리는 캐스팅 불가이므로 Double.value 메소드 사용  
		System.out.println(v);
		
		
		String userInput = "NaN";
		double val = Double.valueOf( userInput );
		
		double currentBalance = 10000.0;
		
		if(Double.isNaN(val)) {
			val = 0.0;
		}
		
		currentBalance += val;
		System.out.println(currentBalance);
	}

}
