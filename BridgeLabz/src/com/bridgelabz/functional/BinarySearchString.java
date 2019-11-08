package com.bridgelabz.functional;

import java.util.Scanner;

public class BinarySearchString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String arr[]= {"apple","ball","cat","dog","elephant","fox"};
		System.out.println("Enter String to be searched");
		String search=sc.nextLine();
		int f=0,l=arr.length-1,mid=(f+l)/2;
		while(f<=l) {
			if(arr[mid].compareTo(search)==0) {
				System.out.println(mid);
				return;
			}else if(arr[mid].compareTo(search)>0) {
				l=mid-1;
			}else if(arr[mid].compareTo(search)<0){
				f=mid+1;
			}
			mid=(f+l)/2;
		}
		System.out.println("String not found");
	}

}
