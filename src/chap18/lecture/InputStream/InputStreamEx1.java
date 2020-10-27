package chap18.lecture.InputStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamEx1 {
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/lecture/inputstream/InputStreamEx1.java";
		InputStream is = new FileInputStream(path);
		
		int cnt = 0 ; 
		int r = 0;
		//더이상 읽을 내용이없으면 -1
		while ((r = is.read()) != -1) { //읽은값이 integer 니까 r과 -1비교
			System.out.print((char) r);
			cnt++;
		}
		System.out.println(cnt);
		
		
		is.close();
	}
}
