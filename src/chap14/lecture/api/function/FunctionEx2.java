package chap14.lecture.api.function;

import java.util.HashMap;
import java.util.Map;

public class FunctionEx2 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		
		map.put("java", 20);
		map.put("html", 20);
		map.put("css", 20);
		map.put("jquery", 20);
		map.put("dbms", 20);
		map.put("mysql", 20);
		
		map.replaceAll((k,v) -> v*2);
		
		map.forEach((k,v)-> System.out.println(k+":"+v));

	}
}
