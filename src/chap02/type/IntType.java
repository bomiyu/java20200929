package chap02.type;

public class IntType {
	public static void main(String[] args) {
		//	int : 4btye (32bit)
		// 최대 : 2147483647
		// 최소 : -2147483648
		
		int intValue = 2147483647; //작성된 그자체-리터럴 값 
		System.out.println(intValue);
		
		intValue++;
		System.out.println(intValue);//음수로 변환되니까 유의
		
		intValue = -2147483648;
		System.out.println(intValue);
		
		//정수 리터럴
		intValue = 2147483647;
		intValue = 2_147_483_647; //표현가능~!
		intValue = 017777777777;
		System.out.println(intValue);
		
		intValue = 0x7FFFFFFF;
		
		
	}
}
