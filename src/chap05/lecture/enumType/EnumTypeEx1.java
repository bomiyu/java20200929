package chap05.lecture.enumType;

public class EnumTypeEx1 {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		System.out.println(o1 instanceof Object);
		
		MyEnum e1 = MyEnum.VALUE1;
		MyEnum e2 = MyEnum.MY_VALUE4;
	}
}

class MyClass{}
