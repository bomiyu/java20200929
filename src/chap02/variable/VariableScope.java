package chap02.variable;

public class VariableScope {
	public static void main(String[] args) {
//		변수의 사용 범위
//		선언된 코드 블럭 안에서만 사용 가능 
		int a = 3;
		
		if (true) {
			int b = 5; //변수 사용된 코드블럭 안에서만 사용가능 if문 안에서만 println사용가능 
			System.out.println(a);
			System.out.println(b);
		}
		System.out.println(a);
//		System.out.println(b);//b는 해당 코드블록에 없으니 컴파일에러~ 주석처리해야 실행가능 
	}
	
}
