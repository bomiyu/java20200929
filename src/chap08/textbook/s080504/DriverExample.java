package chap08.textbook.s080504;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver(); // Driver();라는것으로 객체 실행하며 생성 시켜 driver에 할당

		Bus bus = new Bus();// Bus();라는것으로 객체 실행하며 생성 시켜 driver에 할당
		Taxi taxi = new Taxi();// Taxi();라는것으로 객체 실행하며 생성 시켜 driver에 할당

		driver.drive(bus);// driver의 run메소드 실행하지만 실제로는 구현클래스의 메소드로~!!
		driver.drive(taxi);
	}
}
