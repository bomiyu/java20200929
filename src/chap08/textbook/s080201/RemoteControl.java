package chap08.textbook.s080201;

public interface RemoteControl {// 인터페이스는 필드를 가질수있지만 모든 필드는 public static final
	public int MAX_VOLUME = 10; // public static final 생략가능
	public int MIN_VOLUME = 0; // 상수기때문에 모든알파벳 대문자

	// 추상메소드
	void turnOn();// public abstract 생략가능

	public void turnOff();
	
	public void setVolume(int volume);

	// 디폴트 메소드
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}

	}

	static void changeBattery() { // public 생략 가능
		System.out.println("건전지를 교환합니다.");
	}

}
