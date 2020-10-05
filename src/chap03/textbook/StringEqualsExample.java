package chap03.textbook;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		String strVar3 = new String("신민철");
		
		System.out.println( strVar1 == strVar2);
		System.out.println( strVar1 == strVar3);
		System.out.println();
		System.out.println(strVar1.equals(strVar2)); //true//실제가지고 있는값 비교 equals메소드~
		System.out.println(strVar1.equals(strVar3)); //true
		
		
		
	}
}
