package chap18.textbook.s180504;

import java.util.Date;

public class PrintExample {
	public static void main(String[] args) {
		System.out.printf("상품의 가격: %d원\n",123);
		System.out.printf("상품의 가격: %6d원\n",123);//6개의 자리를 
		System.out.printf("상품의 가격: %-6d원\n",123);//왼쪽정렬
		System.out.printf("상품의 가격: %06d원\n",123);//6개 자리만들되 나머지를 0으로 채워라
		
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, Math.PI*10*10);//총10개중에 소수점은 두개 
		
		System.out.printf("%6d | %-10s | %10s\n", 1, "홍길동", "도적");
		
		Date now = new Date();
		System.out.printf("오늘은 %tY년 %tm월 %td일 입니다\n", now, now, now);
		System.out.printf("오늘은 %1$tY년 %1$tm월 %1$td일 입니다\n", now);// 뒤에 들어가는 아규먼트를 적절한 포맷에 들어감
		System.out.printf("현재  %1$tH시 %1$tM분 %1$tS초 입니다\n", now);
		
	}
}
