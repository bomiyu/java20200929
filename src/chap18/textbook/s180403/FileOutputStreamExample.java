package chap18.textbook.s180403;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String[] args) throws Exception {
		String originalFileName =  "src/chap18/textbook/s180403/FileOutputStreamExample.java";
		String targetFileName = "copy.txt";
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		
		while ((readByteNo = fis.read(readBytes))!= -1) { //100을리턴 
			fos.write(readBytes, 0, readByteNo); //0번부터 100개 를 읽어내고 씀 
		}
		fos.flush(); //채워넣은것을 다써라
		fis.close();
		fos.close();
		
		System.out.println("복사가 잘 되었습니다.");
				
	}
}
