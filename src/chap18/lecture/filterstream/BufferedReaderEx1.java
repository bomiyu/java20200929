package chap18.lecture.filterstream;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderEx1 {
	public static void main(String[] args) throws Exception {
		String path = "src\\chap1\\lecture\\filterstream\\BufferedReaderEx1.java";
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();//enter가 만나기전까지 줄을 읽는 메소드 
		System.out.println(line);
		
		br.close();
		fr.close();

	}
}
