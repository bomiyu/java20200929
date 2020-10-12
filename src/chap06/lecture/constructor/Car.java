package chap06.lecture.constructor;

public class Car {
	String name;
	int price;

	// 생성자
	// 클래스명 (파라미터목록) {
	// 실행코드;
	// }
	public Car() {
		System.out.println("생성자 실행됨");
		name = "kia";
		price = 500;

	}

		public Car(String carName) {
			System.out.println("String 받는 생성자 실행됨");
			System.out.println(carName); //값도 잘들어왔는지 출력해봄
			name = carName;//주로 쓰는놈~!
		}
		
		public Car(String carName, int carPrice) {
			name=carName;
			price=carPrice;
		}
}

