package chap18.textbook.s180404;

import java.io.FileReader;

public class FileReaderExample {
	public static void main(String[] args) throws Exception {
		FileReader fr 
		= new FileReader("src/chap18/textbook/s180404/fileReaderExample.java");
		
		int readCharNo;
		char[ ] cbuf = new char[100];//100개의 문자를 읽어서~ 
		while((readCharNo=fr.read(cbuf))!= -1) {//더이상 읽을것이 없을때  100개씩 3번 진행하고 마지막에100이하될때 멈춤
			String data = new String(cbuf, 0 , readCharNo); // 문자배열 cbuf에서 스트링만들고 시작위치, 길이 같이 지정 
			System.out.println(data);
		}
		
		fr.close();
	}
}
