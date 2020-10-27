package chap18.lecture.inputstream;

import java.io.FileInputStream; //사용하는 스트림 입력 꼭 
import java.io.InputStream;

public class InputStreamEx2 {
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/lecture/inputstream/InputStreamEx2.java";
		InputStream is = new FileInputStream(path);
		
		byte[] datas = new byte[10];
		
		int readCnt = 0;//최대길이만큼 읽음  리턴으로 값을 볼수잇음
		int loopCnt = 0;
		while ((readCnt = is.read(datas))!= -1) {//읽을게 없으면 -1리턴 
			loopCnt++;
		}
		System.out.println(loopCnt);
	

		is.close();

	}
}
