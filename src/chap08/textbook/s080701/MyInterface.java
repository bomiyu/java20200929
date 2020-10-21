package chap08.textbook.s080701;

public interface MyInterface {
	public void method1();
	public default void method2() { //몸통을 만들수 있는 메소드  =Override안해도 문제없음 
		System.out.println("MyInterface-method2");
	};
}
