package chap06.textbook.s060705;

public class Car {
	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	// 생성자
	Car() {

	}

	Car(String model) {
		this(model, "은색", 250); //this 가르키는것 = 다른생성자~
	}

	Car(String model, String color) {
		this(model, color, 250);
	}

	Car(String model, String color, int maxSpeed) {
		this.model = model;//this 가르키는것 = 필드~
		this.color = color;
		this.maxSpeed = maxSpeed;

	}
}
