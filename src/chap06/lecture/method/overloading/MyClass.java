package chap06.lecture.method.overloading;

public class MyClass {
	void method1() {
		System.out.println("method1.......");
	}

	void method1(int i) { // 메소드명이 같을 때 파라미터값이 달라야함
		System.out.println("method1####################");
	}

	void method1(double j) { // 메소드명 같을 때 파라미터 타입이 달라야함
		System.out.println("method1~~~~~~~~~~~");
	}

	void method1(int i, int j) { // 메소드명 같을 때 파라미터 갯수 달라야함
		System.out.println("method1 int, int");
	}

	void method1(int j, double i) {
		System.out.println("method1 int, double");
	}

	void method1(double j, int i) {
		System.out.println("method1 double,int");
	}
//	 int method1( double j,int i) {		
//		 System.out.println("method1 double,int, return int");
//	 }

}
