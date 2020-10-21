package chap07.lecture.superConstructor;

public class ChildClass extends ParentClass {
	public ChildClass() {
//		super();//부모class 호출
		super(1);
		
	}
	@Override
	void method1() {
		super.method1();
		System.out.println("child method1");
	}

}
