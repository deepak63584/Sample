package com.bridgelabz.functional;
import java.util.*;
public class Permute{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String to see Permutation");
		String str=sc.nextLine();
		int end=str.length();
		permute(str,0,end);
	}
	public static String swap(String a,int i,int j) {
		char[] b=a.toCharArray();
		char ch;
		ch=b[i];
		b[i]=b[j];
		b[j]=ch;
		return String.valueOf(b);
	}
	public static void permute(String str,int start,int end) {
		if(start==end-1) {
			System.out.println(str);
		}else {
			for(int i=start;i<end;i++) {
				str=swap(str,start,i);
				permute(str,start+1,end);
				str=swap(str,start,i);
			}
		}
	}
}
