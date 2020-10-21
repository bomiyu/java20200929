package chap08.textbook.s080505;

public class Driver {
	public void drive(Vehicle vehicle) {
		if (vehicle instanceof Bus) { //안전하게 casting가능한지 체크 if문 
			Bus bus = (Bus) vehicle;//vehicle instanceof Bus 값이 true일때만 실행되는 코드 
			bus.checkFare();

		}
		vehicle.run();
	}
}
