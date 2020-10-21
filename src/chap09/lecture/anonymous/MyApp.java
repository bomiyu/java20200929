package chap09.lecture.anonymous;

public class MyApp {
	public static void main(String[] args) {
		Parent p1 = new Child();
		p1.method1();

		Parent p2 = new Parent() {// Parent생성과 클래스 몸통 (인스턴스)생성
			@Override
			public void method1() {
				System.out.println("anonymous method1");
			}
		};
		p2.method1();
		
		Parent p3= new Parent() {
			
		};
		
	}
}
