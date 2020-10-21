package chap10.lecture.throwsKeyword;

public class ThrowsEx1 {
	public static void main(String[] args) {
		method1();
	}

	public static void method1() {
		method2();
	}

	public static void method2() {
		method3();
	}

	public static void method3() {
		Class.forName("java.lang.String2");
	}
}
