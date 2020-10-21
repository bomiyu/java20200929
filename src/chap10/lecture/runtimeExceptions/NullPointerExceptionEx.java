package chap10.lecture.runtimeExceptions;

public class NullPointerExceptionEx {
	public static void main(String[] args) {
		int[] a = null;
		
		System.out.println(a.length); //비어잇는것을 실행하려고하니 NullPointerExceptionEx.main(NullPointerExceptionEx.java:7)발생 
	}
}
