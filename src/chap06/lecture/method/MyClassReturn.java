package chap06.lecture.method;

public class MyClassReturn {
	int var1;
	
	void method1() { //리턴필요없을때는 void~~를 씀 ~!!!!!!!!!
		System.out.println("메소드1 실행");
		
	}
	
	int method2() {
		System.out.println("메소드2 실행");
		
		//return(반환한다) :메소드 종료, 오른쪽에 있는 값을 호출한 곳으로 돌려줌 
		return var1*2; //어떤일을 돌려놓고싶다는것 return 
//		System.out.println("실행");//error
	}
}


