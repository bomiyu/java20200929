package chap06.lecture.finalKeyword;

public class MyApp {
	public static void main(String[] args) {
		int i;
		final int j;// 지역변수 아니라 필드에도 붙을수있음 //한번은 할당 받아야함 final 필드가 있는곳을 꼭 생성자위치에 할당해줘야함
		
		i = 30;
		i = 40;
		
		j = 20;
//		j = 10;
		
		MyClass o1 = new MyClass();
		o1.field1 = 3;
//		o1.field2 = 4;
		
		
	}
}











