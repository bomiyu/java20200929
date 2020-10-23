package codingbat;

public class WarmUp2 {
	
	
	public String stringTimes(String str, int n) { //str을 n번만큼 붙여서 완성 시켜야함
		String res = "";

		for (int i = 0; i < n; i++) {//n번 이하만큼 i반복 
			res += str;//str을 res에 할당하면서 
		}

		return res;
	}

	
	
//	앞의 3글자를 n번동안 반복해서 찍음 
	public String frontTimes(String str, int n) {
		String res = "";

		String front = str;//기본으로 str을 front에 할당 

		if (str.length() > 3) { //스트링길이가 3개 이상일때는 
			front = str.substring(0, 3);//앞의 세글자를 자르면서 front에 할당 
		}

		for (int i = 0; i < n; i++) {
			res += front;
		}

		return res;
	}

	
	
	//
	int countXX(String str) {
		int cnt = 0;
		int len = str.length();

		// String sub = str.substring(0, 2);
		// str.substring(len-2, len);

		for (int i = 0; i <= len - 2; i++) { //
			String sub = str.substring(i, i + 2);
			if (sub.equals("xx")) {
				cnt++;
			}
		}

		return cnt;
	}

	
	
	boolean doubleX(String str) {
		int xinx = str.indexOf("x");
		int xxinx = str.indexOf("xx");

		if (xinx == -1) {
			return false;
		}

		if (xinx == xxinx) {
			return true;
		}

		return false;
	}

	public String stringBits(String str) {
		String res = "";

		for (int i = 0; i < str.length(); i += 2) {
			res += str.charAt(i);
		}

		return res;
	}
	
}
