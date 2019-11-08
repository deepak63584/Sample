package com.bridgelabz.functional;
import java.util.*;
public class StringFunctions{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String One");
		String str1=sc.nextLine();
		System.out.println("Enter String Two");
		String str2=sc.nextLine();
		if(isAnagram(str1,str2)) {
			System.out.println("Strings are Anagram");
		}else {
			System.out.println("Strings are Not Anagram");
		}
		System.out.println("Enter String to Palindrome check");
		String str3=sc.nextLine();
		if(isPalin(str3)) {
			System.out.println("String is Palindome");
		}else {
			System.out.println("String is Not Palindome");
		}
	}
	
	public static boolean isAnagram(String str1,String str2) {
		int len1=str1.length(),len2=str2.length(),found=0;
		if(len1!=len2) {
			return false;
		}else {
			for(int i=0;i<len1;i++) {
				for(int j=0;j<len2;j++) {
					if(str1.charAt(i)==str2.charAt(j)) {
						found++;
					}
				}
				if(found<1) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean isPalin(String str) {
		int len=str.length()-1;
		double mid=Math.floor(len/2);
		for(int i=0;i<mid;i++) {
			if(str.charAt(i)!=str.charAt(len-i)) {
				return false;
			}
		}
		return true;
	}
	
}