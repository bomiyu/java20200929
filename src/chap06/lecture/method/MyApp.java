package chap06.lecture.method;

public class MyApp {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		o1.var1 = 3;
		o1.myMethod(); //기능 실행시킬 수있는데
//		o1.yourMethod//없는 기능 사용하면 error
		
		MyClass o2 = new MyClass();
		o2.myMethod(); 
		
		o2.myMethod2(5);//파라미터에 값이 없어 에러 남호출 할때 값(int타입) 넣어야함 
		o2.myMethod2(7);
		
		o1.myMethod2(7);
		
		o1.myMethod3(1, 2);
	
	}
}
