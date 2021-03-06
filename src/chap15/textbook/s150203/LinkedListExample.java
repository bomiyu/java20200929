package chap15.textbook.s150203;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i = 0; i<10000; i++) {
			list1.add(0,String.valueOf(i));// 0번인덱스에 인덱스가 i번째까지 for문 실행하면서 add 
		}
		
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간:" + (endTime-startTime) + "ns");
		
		startTime = System.nanoTime();
		for(int i=0;i<10000;i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("linkedList 걸린시간:"+ (endTime-startTime) + "ns");
	}
}
