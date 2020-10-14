package chap06.lecture.encapsulation;

public class Car {
	private int speedKm;

	public void setSpeed(int speed) {
		if (speed >= 0) {
			this.speedKm = speed;
		}
		this.speedKm = speed;
	}

	public int getSpeed() {
		return this.speedKm;
	}

}
