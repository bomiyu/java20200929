package chap11.object.equals;

public class EqualsEx1 {
	public static void main(String[] args) {
		Book b1 = new Book(963);
		Book b2 = new Book(963);
		
		System.out.println(b1 == b2);
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
	}
}
