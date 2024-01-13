package com.britishTelecom.practiceUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PracticeIterator {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Geeks");
		list.add("for");
		list.add("Geeks");
		
		
		System.out.println("Notmal for loop");
		for(int i = 0;i < list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("using enhanced for loop");
		for(String e : list) {
			System.out.println(e);
		}
		
		System.out.println("using forEach() method");
		list.forEach((ele)->{
			System.out.println(ele);
		});
		
		System.out.println("using Iterator");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}

	}

}
