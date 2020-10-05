package chap02.type;

public class CharType {
	public static void main(String[] args) {
//		char : 2byte	
//		작은 따옴표를 이용해 하나의 문자를 표현
		
		char charValue;
		charValue = 'a'; //하나의 문자로만 표현가능 
		System.out.println(charValue);
		
//		charValue = 'ab' /error
//		charValue = ''; /error
		charValue = ' '; //스페이스라는 문자
		
		charValue = 44032; // 10진법표현
		System.out.println(charValue);
		
		charValue = '나';
		System.out.println(charValue);
		
		charValue = '\uac00';// 역슬래시u랑 16진법같이써주면됨
		System.out.println(charValue);
		
	}

	
}
