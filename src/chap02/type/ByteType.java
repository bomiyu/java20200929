package chap02.type;

public class ByteType {
	public static void main(String[] args) {
//		byte : 정수형 _양수 음수 0 
//		크기: 1byte (8bit)
		
//	    -128 : 1000 0000
//		   :
//		-3 : 1111 1101
//		-2 : 1111 1110
//		-1 : 1111 1111
		
//      +1 :		
		
		
//		 0 : 0000 0000
//		 1 : 0000 0001 
//		 2 : 0000 0010 // 이진법이므로 1의 바이트 코드 에서 1더해서 다음자리가 1이됨
//		   :
//		 127 : 0111 1111 // 맨앞에 1이면 음수 0이면 0 또는 양수
		
//		 +1
//		 -128 : 1000 0000 // 음수로됨  //윈도우 계산기로 시뮬레이션 가능
		
		byte byteValue;
		byteValue = 0;
		System.out.println(byteValue);
		
		byteValue = 127;
		System.out.println(byteValue);
		
//		byteValue = 128; //컴파일오류

		byteValue++;
		System.out.println(byteValue); //결과는 -128 최대양수는 127이기때문~!
	}
}
