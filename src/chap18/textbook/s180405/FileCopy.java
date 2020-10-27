package chap18.textbook.s180405;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopy {
	public static void main(String[] args) throws Exception {
		String src = "src/chap18/textbook/s180405/FileCopy.java";
		String des = "file-copy.txt";
		
		//Reader, Writer사용해서 파일 복사 
		
		FileReader fr 
		= new FileReader("src/chap18/textbook/s180404/fileReaderExample.java");
		
		int readCharNo;
		char[ ] cbuf = new char[100];//100개의 문자를 읽어서~ 
		while((readCharNo=fr.read(cbuf))!= -1) {//더이상 읽을것이 없을때  100개씩 3번 진행하고 마지막에100이하될때 멈춤
			String data = new String(cbuf, 0 , readCharNo); // 문자배열 cbuf에서 스트링만들고 시작위치, 길이 같이 지정 
			System.out.println(data);
		}
		
		fr.close();
		
		File file = new File("src/chap18/textbook/s180405/FileCopy.java");

		
		FileWriter fw = new FileWriter(file, true);

		fw.flush();
		fw.close();
		System.out.println("파일에 저장되었습니다.");
	}
}
