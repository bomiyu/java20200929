package chap18.lecture.inputstream.outputstream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamEx1 {
public static void main(String[] args) throws Exception {
	String path = "output.txt";
	OutputStream os = new FileOutputStream(path);
	
	os.write(65);//인티저 타입이니까
	os.write(66);
	
	
	os.close();
}
}
