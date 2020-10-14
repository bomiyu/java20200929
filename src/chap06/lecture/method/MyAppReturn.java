package chap06.lecture.method;

public class MyAppReturn {
	public static void main(String[] args) {
		MyClassReturn o1 = new MyClassReturn();
		o1.method1();
		o1.var1 = 5;

		int v = o1.method2();// 실행,return의 일을 하게됨 실제보이진않음 (값이 치환됨) 그러므로 int타입에 값으로 저장함
		// method2를 실행했을때 두개의 스테이트먼트 실행됨

		System.out.println(v);

	}

}
