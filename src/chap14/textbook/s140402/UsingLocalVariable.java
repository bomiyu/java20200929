package chap14.textbook.s140402;

public class UsingLocalVariable {
	void method(int arg) {

		int localVar = 40;

		// arg = 31;
		// localVar = 41;

		// 람다식
		MyFunctionalInterface fi = () -> {

			// 로컬변수로 읽기
			System.out.println("arg:" + arg);
			System.out.println("localVal:" + localVar + "\n");
		};
		fi.method();
	}
}
