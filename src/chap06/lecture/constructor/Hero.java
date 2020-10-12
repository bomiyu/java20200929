package chap06.lecture.constructor;

public class Hero {
	String name;
	int power;

	public Hero(String name, int power) {
		this.name = name;// 인스턴스 대체하는 키워드 this
		this.power = power;

	}

	public Hero(String name) {
		this(name, 100);
	}
}
