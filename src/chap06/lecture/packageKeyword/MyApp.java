package chap06.lecture.packageKeyword;

import java.util.Scanner;//ctr+ shift+ o 누르면 필요한 패키지 생성가능 
import java.util.*;
//import java.lang.String; //lang은 생략가능 같은 패키지 안에있으면 import필요없음 

public class MyApp {
	public static void main(String[] args) {
//		chap06.lecture.packageKeyword.MyClass o1 = new chap06.lecture.packageKeyword.MyClass(); //같은 패키지 내에서는 이렇게 안써도됨 

		MyClass o2 = new MyClass();

		chap06.lecture.MyClass o3 = new chap06.lecture.MyClass();

		java.util.Scanner scanner = new java.util.Scanner(System.in);
		Scanner s2 = new Scanner(System.in);

		java.lang.String str = "java";
		String str2 = "css";

		ArrayList list = new ArrayList();

	}
}
