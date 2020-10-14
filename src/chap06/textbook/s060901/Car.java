package chap06.textbook.s060901;

public class Car {
	// 필드
	String model;
	int speed;

	// 생성자
	Car(String model) {
		this.model = model;
	}

	// 메소드
	void setSpeed(int speed) {
		this.speed = speed; //자신의 필드 또는 메소드 this!!!!!!!!!!!!!!!!!
	}

	void run() {
		for (int i = 0; i <= 50; i += 10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h)");
		}
	}
}
