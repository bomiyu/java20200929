package chap04.exercises;

public class Exercise05 {
	public static void main(String[] args) {
//		중첩for문을 사용 방정식 4x + 5y = 60의 모든 해(x,y)로 출력 단,x와y는 10이하의 자연수
		for(int i =0; i<=10; i++) {
			for(int j=0; j <=10; j++) {
				if(((4*i)+(5*j))==60) {
					System.out.println("(" + i + "," + j + ")"); 
					
				}
			}
		}
		
		
	}
}
