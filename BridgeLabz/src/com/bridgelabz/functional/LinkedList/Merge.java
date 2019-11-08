package com.bridgelabz.functional.LinkedList;

public class Merge {
	public LinkedList merge(LinkedList list1, LinkedList list2) {
		LinkedList list3=new LinkedList();
		
		for(int i=0;i<list1.len();i++) {
			list3.push(list1.get(i));
			list3.push(list2.get(i));
		}
		return list3;
	}
}
