package chap05;

public class ReferenceType5 {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = new String("java"); // 인스턴스 하나만들어놓고 str1,2둘다 참조함

		str2 = null;// 참조하는 것이 의미가 없다는 뜻

		// java virtual machine은
		// 불필요한 인스턴스를 모아 제거함
		// -->> garbage collector (gc)

	}
}
