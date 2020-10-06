package chap11.string;

import javax.sound.midi.Soundbank;

public class StringEx1 {
	public static void main(String[] args) {
//		charAt()
		String str1 = "java";
		char c1 = str1.charAt(0);
		System.out.println(c1);
		System.out.println(str1.charAt(1));
		System.out.println(str1.charAt(2));
		System.out.println(str1.charAt(3));
//		System.out.println(str1.charAt(4));
		
//		equals
		String str2 = "python";
		String str3 = "python";
		String str4 = "py";
		String str5 = "thon";
		String str6 = str4 + str5;
		
		
		System.out.println(str2);
		System.out.println(str6);
	
		
		System.out.println(str2 == str6);//참조타입에서 쓸수있는 연산자가 아님 
		System.out.println(str2.equals(str6));
		
//		indexOf
		String str7 = "자바 프로그래밍";
		int a = str7.indexOf("로"); // 찾는 글자없을경우 -1리턴됨 외우지 않아도 java 8 api에서 찾아보면됨
		System.out.println(a);
		
//		length
		String str8 = "자바 프로그래밍";
		int l = str8.length();
		System.out.println(l);
		System.out.println(str8.charAt(l-1));
//		replace 문자열 바꾸기 
		String str9 = "abcdefabcdefg";
		String str10 = str9.replace("abc", "123");
		System.out.println(str10);
		
//		substring 문자열 잘라내기
		String str11= "0123456789";
		String sub = str11.substring(2, 3); //시작인덱스, 마지막인덱스~
		System.out.println(sub);
		sub = str11.substring(5, str11.length());
		System.out.println(sub);
		
		sub = str11.substring(6);
		System.out.println(sub);
		
//		trim 앞뒤공백 잘라내기
		String str12 = " java ";
		String t = str12.trim();
		System.out.println(t);
		System.out.println(str12);
		
		
		
		
	}
}
