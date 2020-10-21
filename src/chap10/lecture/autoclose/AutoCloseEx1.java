package chap10.lecture.autoclose;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AutoCloseEx1 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("file.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			fis.close();
		}
	}
}
