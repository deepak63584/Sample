package com.bridgelabz.functional.LinkedList;
import java.util.*;

public class Runner {

	public static void main(String[] args) {
		LinkedList list1=new LinkedList();
		LinkedList list2=new LinkedList();
		LinkedList list3=new LinkedList();

		list1.push(1);
		list1.push(3);
		list1.push(5);
		list1.push(7);
		list2.push(2);
		list2.push(4);
		list2.push(6);
		list2.push(8);

		list1.show();
		System.out.println("");
		list2.show();
		System.out.println("");
		System.out.println(list1.len());
		System.out.println("");

		System.out.println(list1.get(1));
	
		list3=new Merge().merge(list1,list2);
		
		list3.show();
		System.out.println("");
		list3.rev();
		
		
	}
}

