package codingbat;
/*sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true*/
//true값을 찾아야함 조건이 두개 1.두개값이 같아야하거나 2. 앞에값이 부정
public class WarmUp1 {
	public boolean sleepIn(boolean weekday, boolean vacation) {

		return !weekday || vacation; //조건이 두개 두개값이 같아야하거나~그래서 or문을 씀 앞에값이 부정일때 그래서 앞에 부정문을씀. 

	}
	/*monkeyTrouble(true, true) → true
	monkeyTrouble(false, false) → true
	monkeyTrouble(true, false) → false*/
//	두개의 값이 상반된 값이 아닐때 
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		return !(aSmile ^ bSmile);
	}
	
	/*sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8*/
//	두개값의 합 이거나 두개값이 같으면 합의 2배
	public int sumDouble(int a, int b) {
		int sum = a + b;// a+b를 sum에 할당 

		sum = (a == b) ? sum * 2 : sum; //a가 b와 같으면 ? 두배 아니면? sum값을 return

		return sum;
	}
	
	
/*diff21(19) → 2
diff21(10) → 11
diff21(21) → 0*/
//	21빼기 n값 
	public int diff21(int n) {
		int diff = 21 - n; //21 -n을 diff에 할당
		diff = (n > 21) ? diff * 2 : diff; //21보다 크면 diff에 두배 아니면 diff 
		diff = (diff < 0) ? -diff : diff; //diff가 음수면 -diff 아니면 diff
		return diff;
	}
	/*parrotTrouble(true, 6) → true
	parrotTrouble(true, 7) → false
	parrotTrouble(false, 6) → false*/
//	hour가 7이하or 20이하  //무조건 참인조건!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	public boolean parrotTrouble(boolean talking, int hour) {
		return talking && (hour < 7 || hour > 20);
	}
/*makes10(9, 10) → true
makes10(9, 9) → false
makes10(1, 9) → true
*/
//	둘중 하나10포함 , 두개의 합이 10 , 그외 false
	public boolean makes10(int a, int b) {
		int sum = a + b; //두개의 합을 sum에 할당

		return (sum == 10) || (a == 10) || (b == 10); //10이 합이면~ or a가 10이면~ or b가 10이면~
	}
/*nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false*/
//100보다 10차이, 200보다 10차이 
	public boolean nearHundred(int n) {
		boolean d100 = (n >= 90) && (n <= 110);//	90보다 크거나 같고~  110보다 작거나 같고
		boolean d200 = (n >= 190) && (n <= 210);//190보다 크거나 같고~ 210보다 작거나 같고

		return d100 || d200; //둘중 하나 만족
	}
	/*posNeg(1, -1, false) → true
	posNeg(-1, 1, false) → true
	posNeg(-4, -5, true) → true*/
//	둘중 하나 음수 이거나 둘다 음수 일경우~
	public boolean posNeg(int a, int b, boolean negative) {
		boolean aneg = a < 0; //a가 음수 일경우
		boolean bneg = b < 0; //b가 음수 일경우

		return negative ? (aneg && bneg) : (aneg ^ bneg);//	1항결과true면 2항결과 false면 3항결과
	}

	
/*	notString("candy") → "not candy"
	notString("x") → "not x"
	notString("not bad") → "not bad"*/
//	not없으면 스트링not을 붙이고 not있으면 그대로 
	public String notString(String str) {
		int ind = str.indexOf("not"); //not스트링을 찾아서 ind에 할당

		if (ind != 0) { //ind가  0이 아니면(없으면)
			String res = "not " + str;
			return res;
		}

		return str;// not있으면 그대로 
	}

	/*
	missingChar("kitten", 1) → "ktten"
	missingChar("kitten", 0) → "itten"
	missingChar("kitten", 4) → "kittn"*/
//	str에서 n번째의 값을뺀것 = 왼쪽+오른쪽 값 붙이기 
	public String missingChar(String str, int n) {
		String left = str.substring(0, n);
		String right = str.substring(n + 1);

		return left + right;
	}
	
	public String frontBack(String str) {
		int len = str.length();

		if (len > 1) {
			char front = str.charAt(0);
			char back = str.charAt(len - 1);

			String mid = str.substring(1, len - 1);

			return back + mid + front;
		} else {
			return str;
		}
	}
	
	
	public String front3(String str) {
		int len = str.length();

		String front = str;

		if (len >= 3) {
			front = str.substring(0, 3);
		}

		String res = "";
		int i = 0;
		while (i < 3) {
			res += front;
			i++;
		}

		return res;
	}
}
