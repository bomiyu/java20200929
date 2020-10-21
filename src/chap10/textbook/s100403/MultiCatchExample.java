package chap10.textbook.s100403;

public class MultiCatchExample {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + " + " + data2 + " =  " + result);

		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) { //자바 7부터~~사용가능 
			System.out.println("실행 매개값의 수가 부족하거나 숫자로 변환할 수 없습니다.");
		} catch (Exception e) {
			System.out.println("알수없는예외발생");
		} finally {
			System.out.println("다시실행하세요");
		}
	}
}
