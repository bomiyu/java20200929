package chap15.lecture.set;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {
	public static void main(String[] args) {
		//순서가 없고, 중복되지 않음 
		Set<String> set = new HashSet<>();
		//추가
		set.add("java");
		set.add("html");
		set.add("css");
		set.add("java");
		
		System.out.println(set.size());
	}
}
