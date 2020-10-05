package chap02.type.casting;

public class TypeCastingEx1 {
	public static void main(String[] args) {
//		primitive type 8개
//		1byte   2byte 4byte 8byte
//		boolean char
//		byte    short int   long    /큰크기를 작은 크기로 변환시 강제 변환(앞에 키워드 명시필요~!)
//	                  float double
		
		byte byteValue = 3;
		short shortValue = 129;
		int intValue = 1000000;
		long longValue = 10000000000000L;
		
		//자동 형변환
		shortValue = byteValue;
		intValue = shortValue;
		longValue = intValue; 
		
		//강제 형변환    
		longValue = 3333;
		intValue = (int) longValue; //error 안나게 int명시  변환할 키워드를 꼭!
		System.out.println(intValue);
		
		//자동형변환 (정수->실수)
		float floatValue = 0.0F;
		double doubleValue = 0.0;
		
		doubleValue = intValue;
		floatValue = intValue; //4byte 둘다~! 그렇지만 값을 잃을수 있음 32비트안에 
		
		longValue = 9223372036854775807L;
		floatValue = longValue; //플로트는 넓은범위 표현가능하지만 값잃을수 있음
		System.out.println(floatValue);

		doubleValue = longValue;//8byte 둘다~! 그렇지만 값을 잃을수 있음 32비트안에 
		
		//강제 형변환 (실수->정수)
		intValue = (int) floatValue; //당연히 소수점 밑 버려짐 
		
		
		
	}  
}
