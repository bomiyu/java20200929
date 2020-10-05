package chap02.type;

public class LongType {
 public static void main(String[] args) {
//	long : 8byte (64bit) //1이 63개~
//	 최대값: 9223372036854775807
//	 최소값: -9223372036854775808
		 
	 long longValue;
	 longValue = 9223372036854775807L; //L을 넣어줌 롱 타입의 리터럴값
	 System.out.println(longValue);
	 
	 longValue = 9_223_372_036_854_775_807L;
	 
	 longValue = -9223372036854775808L;
	 System.out.println(longValue);
	 
 }
}
