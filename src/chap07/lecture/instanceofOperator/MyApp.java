package chap07.lecture.instanceofOperator;

public class MyApp {
	public static void main(String[] args) {
		SuperClass o1 = new SubClass();
		
		//instanceof : 좌변(항)이 참조변수, 우변이 타입
		//결과 :boolean
		
		sout
		SubClass o2 = (SubClass) o1;
		SubClass2 o3 = (SubClass2) o1;
		
				
	}
}
