package chap07.lecture.casting;

public class MyApp {
	public static void main(String[] args) {
		SuperClass o1 = new SubClass();
		SuperClass[] arr = new SuperClass[3];
		arr[0] = new SubClass();
		method3(new SubClass());

		o1.method1();

		SubClass o2 = (SubClass) o1;// casting 큰타입에서 작은 타입으로 강제 변환 ~
		o2.method2();
	}

	public static void method3(SuperClass s) {
		s.method1(); // 실제 실행은 인스턴스

	}
}
