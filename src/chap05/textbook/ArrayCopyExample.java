package chap05.textbook;

public class ArrayCopyExample {
	public static void main(String[] args) {
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];

		System.arraycopy(oldStrArray, 0, newStrArray, 1, oldStrArray.length);// oldStrArray.length넣은이유는 3개 다 복사할거니까!

		for (int i = 0; i < newStrArray.length; i++) {
			System.out.println(newStrArray[i] + ", ");
		}
	}
}
