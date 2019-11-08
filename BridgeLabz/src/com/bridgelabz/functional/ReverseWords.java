package com.bridgelabz.functional;
import java.util.*;
public class ReverseWords {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
	 String str=sc.nextLine();
	 String str1[]=str.split(" ");
	 String str2="";
	 for(int i=0;i<str1.length;i++) {
		 int len=str1[i].length();
		 for(int j=0;j<len;j++) {
			 str2+=str1[i].charAt(len-1-j);
		 }
		 str2+=" ";
	 }
	 System.out.println(str2);
	}
}
