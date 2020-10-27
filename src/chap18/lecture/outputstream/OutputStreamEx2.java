package chap18.lecture.outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;



public class OutputStreamEx2 {
	public static void main(String[] args) throws Exception {
		String source = "bts.jpg"; 
		String copy = "bts-copy.jpg";
		
		InputStream is = new FileInputStream(source);
		OutputStream os = new FileOutputStream(copy);
		
		int b = 0;
		
		while ((b = is.read()) != -1) {//읽을 파일을 read해서  -1이 될때까지 실행 해서 b에 넣음 
			os.write(b);
		}
		System.out.println("복사완료");
		is.close();
		os.close();
		
	}
}
