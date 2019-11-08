package com.bridgelabz.functional;
import java.util.*;
public class MaxChar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		str=str.toLowerCase();
		char res=str.charAt(0);
		int count1=0;
		for(int i=0;i<str.length()-1;i++) {
			int count2=0;
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count2++;
				}
				if(count1<count2) {
					count1=count2;
					res=str.charAt(i);
				}
			}
		}
		System.out.println(res);
	}
}
