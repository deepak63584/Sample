package com.bridgelabz.functional;
import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		int last=str.length();
		int mid=str.length()/2;
		for(int i=0;i<mid;i++) {
			if(str.charAt(i)!=str.charAt(last-1-i)) {
				System.out.println("Palindrome not Possible");
				return;
			}
		}
		System.out.println("Palindrome Possible");
	}
}
