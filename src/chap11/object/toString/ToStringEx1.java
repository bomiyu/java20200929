package chap11.object.toString;

public class ToStringEx1 {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		String s = o1.toString();
		System.out.println(s); // 타입과 @와 연결해서 참조값이 출력되게됨

		MyClass o2 = new MyClass();
		String s2 = o2.toString();
		System.out.println(s2);
		
		System.out.println(s2.toString());//아래의 결과와 같고
		System.out.println(s2);//위의 결과와같음
	}
}
