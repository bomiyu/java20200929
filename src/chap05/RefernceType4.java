package chap05;

public class RefernceType4 {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");

		System.out.println(str1 == str2);
		System.out.println(str1 == str3);

		System.out.println(str1.equals(str3)); // 인스턴스가 가진 문자열 비교~!!!!

	}
}
