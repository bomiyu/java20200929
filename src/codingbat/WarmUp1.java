package codingbat;

/*sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true*/
//true값을 찾아야함 조건이 두개 1.두개값이 같아야하거나 2. 앞에값이 부정
public class WarmUp1 {
	public boolean sleepIn(boolean weekday, boolean vacation) {

		return !weekday || vacation; // 조건이 두개 두개값이 같아야하거나~그래서 or문을 씀 앞에값이 부정일때 그래서 앞에 부정문을씀.

	}

	/*
	 * monkeyTrouble(true, true) → true monkeyTrouble(false, false) → true
	 * monkeyTrouble(true, false) → false
	 */
//	두개의 값이 상반된 값이 아닐때 
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		return !(aSmile ^ bSmile);
	}

	/*
	 * sumDouble(1, 2) → 3 sumDouble(3, 2) → 5 sumDouble(2, 2) → 8
	 */
//	두개값의 합 이거나 두개값이 같으면 합의 2배
	public int sumDouble(int a, int b) {
		int sum = a + b;// a+b를 sum에 할당

		sum = (a == b) ? sum * 2 : sum; // a가 b와 같으면 ? 두배 아니면? sum값을 return

		return sum;
	}

	/*
	 * diff21(19) → 2 diff21(10) → 11 diff21(21) → 0
	 */
//	21빼기 n값 
	public int diff21(int n) {
		int diff = 21 - n; // 21 -n을 diff에 할당
		diff = (n > 21) ? diff * 2 : diff; // 21보다 크면 diff에 두배 아니면 diff
		diff = (diff < 0) ? -diff : diff; // diff가 음수면 -diff 아니면 diff
		return diff;
	}

	/*
	 * parrotTrouble(true, 6) → true parrotTrouble(true, 7) → false
	 * parrotTrouble(false, 6) → false
	 */
//	hour가 7이하or 20이하  //무조건 참인조건!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	public boolean parrotTrouble(boolean talking, int hour) {
		return talking && (hour < 7 || hour > 20);
	}

	/*
	 * makes10(9, 10) → true makes10(9, 9) → false makes10(1, 9) → true
	 */
//	둘중 하나10포함 , 두개의 합이 10 , 그외 false
	public boolean makes10(int a, int b) {
		int sum = a + b; // 두개의 합을 sum에 할당

		return (sum == 10) || (a == 10) || (b == 10); // 10이 합이면~ or a가 10이면~ or b가 10이면~
	}

	/*
	 * nearHundred(93) → true nearHundred(90) → true nearHundred(89) → false
	 */
//100보다 10차이, 200보다 10차이 
	public boolean nearHundred(int n) {
		boolean d100 = (n >= 90) && (n <= 110);// 90보다 크거나 같고~ 110보다 작거나 같고
		boolean d200 = (n >= 190) && (n <= 210);// 190보다 크거나 같고~ 210보다 작거나 같고

		return d100 || d200; // 둘중 하나 만족
	}

	/*
	 * posNeg(1, -1, false) → true posNeg(-1, 1, false) → true posNeg(-4, -5, true)
	 * → true
	 */
//	둘중 하나 음수 이거나 둘다 음수 일경우~
	public boolean posNeg(int a, int b, boolean negative) {
		boolean aneg = a < 0; // a가 음수 일경우
		boolean bneg = b < 0; // b가 음수 일경우

		return negative ? (aneg && bneg) : (aneg ^ bneg);// 1항결과true면 2항결과 false면 3항결과
	}

	/*
	 * notString("candy") → "not candy" notString("x") → "not x"
	 * notString("not bad") → "not bad"
	 */
//	not없으면 스트링not을 붙이고 not있으면 그대로 
	public String notString(String str) {
		int ind = str.indexOf("not"); // not스트링을 찾아서 ind에 할당

		if (ind != 0) { // ind가 0이 아니면(없으면)
			String res = "not " + str;
			return res;
		}

		return str;// not있으면 그대로
	}

	/*
	 * missingChar("kitten", 1) → "ktten" missingChar("kitten", 0) → "itten"
	 * missingChar("kitten", 4) → "kittn"
	 */
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

	public String backAround(String str) {
		char c = str.charAt(str.length() - 1);
		return c + str + c;
	}

	public boolean or35(int n) {
		boolean div3 = (n % 3) == 0;
		boolean div5 = (n % 5) == 0;

		return div3 || div5;
	}

	public String front22(String str) {
		String front = str;

		if (str.length() >= 2) {
			front = str.substring(0, 2);
		}

		return front + str + front;
	}

	public boolean startHi(String str) {
		return str.startsWith("hi");

		// if (str.length() >= 2) {
		// String front = str.substring(0, 2);
		// return front.equals("hi");
		// } else {
		// return false;
		// }

	}

	public boolean icyHot(int temp1, int temp2) {
		boolean t1 = temp1 < 0 && temp2 > 100;
		boolean t2 = temp1 > 100 && temp2 < 0;

		return t1 || t2;
	}

	public boolean in1020(int a, int b) {
		boolean ina = a >= 10 && a <= 20;
		boolean inb = b >= 10 && b <= 20;

		return ina || inb;
	}

	public boolean hasTeen(int a, int b, int c) {
		boolean ateen = a >= 13 && a <= 19;
		boolean bteen = b >= 13 && b <= 19;
		boolean cteen = c >= 13 && c <= 19;

		return ateen || bteen || cteen;
	}

	public boolean loneTeen(int a, int b) { //
		boolean ateen = a >= 13 && a <= 19; //a가 13이상 이며, 19이하 조건을 ateen에 할당
		boolean bteen = b >= 13 && b <= 19;//b가 13이상 이며, 19이하 조건을 bteen에 할당

		return ateen ^ bteen;
	}

	public String delDel(String str) { //del이라는 문자가 1번째부터 시작하면 삭제 하는 문제 
		int idx = str.indexOf("del"); //str에서 "del"문자위치를 idx에 할당 .indexOf() : stringValue에서 특정한 문자열의 위치(index)를 반환

		if (idx == 1) { //문자위치가 1일때 실행 
			return str.replaceFirst("del", ""); //del을 빈스트링으로~ 즉,삭제!!
		} else {
			return str; //그게아니면 str으로 그냥 리턴해줌
		}
	}

	public String startOz(String str) { //oz로 시작 하면 oz 리턴 , 2번째 값이 z이면 z리턴 ,첫번째 값이 o 면 o리턴 ,그 외 는 빈스트링

		String first = ""; // first초기값 주면서 아래조건 시 재할당
		if (str.length() >= 1) { // 길이가 1이상일때 실행
			char f = str.charAt(0); // 1번째 문자 뽑아서 f에 할당
			if (f == 'o') { // 1번째 문자가 o이면~~
				first = "o";// first에 o를 할당
			}
		}

		String second = "";// second초기값 주면서 아래조건 시 재할당
		if (str.length() >= 2) {// 길이가 2이상일때 실행
			char c = str.charAt(1);// 2번째 문자 뽑아서 c에 할당
			if (c == 'z') {// 2번째 문자가 z이면~~
				second = "z";// second에 z를 할당
			}
		}

		return first + second; // 조건만족한 first + 조건만족한 second 스트링 리턴
	}
	
	
	
	public int intMax(int a, int b, int c) {
		int max; //max변수선언 

		max = a > b ? a : b; //a값이 b보다크면 a 아니면 b
		max = max > c ? max : c; //위의 결과로 max가 c보다크면 max 아니면 c로 할당하여 저장

		return max;
	}

	public int close10(int a, int b) {
		int diffa = Math.abs(10 - a);// 10과 a의 차이를 -->>>> Math.abs()는 절대값 메소드로 쓰임 음수양수 상관없이 값으로 반환함 
		int diffb = Math.abs(10 - b);// 10과 b의 차이를 diffb에 할당 저장

		if (diffa == diffb) { //10과 a의 차이와 10과 b의 차이가 같으면 ~ 
			return 0; //0리턴 
		} else if (diffa < diffb) { //diffb 가 diffa 보다 크면 a리턴~
			return a;
		} else { //그외 b리턴 
			return b;
		}
	}

	public boolean in3050(int a, int b) {
		boolean a3040 = a >= 30 && a <= 40; //a가 30 이상 40이하 
		boolean b3040 = b >= 30 && b <= 40; //b가 ~~
		boolean a4050 = a >= 40 && a <= 50;//a가 40 이상 50이하 
		boolean b4050 = b >= 40 && b <= 50; //b가 ~~

		return (a3040 && b3040) || (a4050 && b4050);// a와 b가 30이상 40이하 또는 a,b가 40이상 50이하 
	}

	public int max1020(int a, int b) {
		int acopy = (a >= 10 && a <= 20) ? a : 0; //a가 10이상 20이하 이면 a 아니면 0 할당
		int bcopy = (b >= 10 && b <= 20) ? b : 0; //b가 ~~~~

		return acopy > bcopy ? acopy : bcopy; //acopy가 bcopy보다 크면 acopy 아니면 bcopy 
	}

	public boolean stringE(String str) {
		int cnt = 0; //카운트 해야해서 초기화 값 변수선언 
		for (int i = 0; i < str.length(); i++) { //인덱스 번호 i를 str길이만큼 증가시키면서 for문 실행 
			char c = str.charAt(i);// 조건이 true이면 i위치의 값을 c에 저장 
			if (c == 'e') { //그값이 e일때 
				cnt++;//카운트 증가 시킴 
			}
		}

		return cnt >= 1 && cnt <= 3;//증가된카운트가 1이상 그리고 3이하 !!!
	}

	public boolean lastDigit(int a, int b) {
		int alast = a % 10;//a를 10으로 나눈나머지
		int blast = b % 10;//b를 ~~

		return alast == blast;// 둘의 값이 같을때 
	}

	public String endUp(String str) {
		int len = str.length(); //스트링의 길이를 len에 할당

		if (len <= 3) {//스트링 길이가 3이하일때 
			return str.toUpperCase(); 
		} else {
			String front = str.substring(0, len - 3);
			String last = str.substring(len - 3, len);
			return front + last.toUpperCase();
		}

	}

	public String everyNth(String str, int n) {
		String res = "";

		for (int i = 0; i < str.length(); i += n) {
			res += str.charAt(i);
		}

		return res;
	}

}


