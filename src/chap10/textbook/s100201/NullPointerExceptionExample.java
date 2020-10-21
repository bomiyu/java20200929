package chap10.textbook.s100201;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		
		System.out.println("프로그램 실행중1");
		String data = null;
		
		System.out.println(data.toString()); //여기까지만 실행하고 멈춤 .NullPointerExceptionExample.main(NullPointerExceptionExample.java:8)
		
		System.out.println("프로그램 실행중2");
	}
}
