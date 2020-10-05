package chap03.binary;

public class LogicalOperator {
	public static void main(String[] args) {
//		논리연산자
//		&& & and :양변이 true일 때만 true
//		|| | or :양변이 false일때만 false
//		^ xor (exclusive or 배타적논리합) : 다를 때만 true
		System.out.println("======and=====");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("======or====="); //둘중하나라도 true면true
		System.out.println(true | true);
		System.out.println(true | false);
		System.out.println(false | true);
		System.out.println(false | false);
		
		System.out.println("======xor=====");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("====== & | =====");
		int a = 3;
		System.out.println(false & false); 
		System.out.println(false & true);
		System.out.println((a < 0) & (a++ < 0)); //앞의 것이 확인되도 뒷연산을 함
		System.out.println(a);
		
		System.out.println("====== && || ====="); 
		System.out.println(false && false); 
		System.out.println(false && true);
		System.out.println((a < 0) && (a++ < 0)); //앞의 것이 확인되면 뒷연산을 안함 
		System.out.println(a);
		
	}
}
