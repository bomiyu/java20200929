package chap06.textbook.exercises.p19;

public class Account {
	//작성위치
	private int Balance;
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	

	public int getBalance() {
		return Balance;
	}

	public void setBalance(int Balance) {
		if (Balance >= MIN_BALANCE && Balance <=MAX_BALANCE) {
			this.Balance = Balance;
			return;
		} else {
			return;
		}
	}
}
