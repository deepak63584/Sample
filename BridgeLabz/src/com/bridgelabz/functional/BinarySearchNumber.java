package com.bridgelabz.functional;
import java.util.*;
public class BinarySearchNumber{
	public static void main(String[] args) {

		
		int arr[]= {3,6,8,23,45,67};
		int start=0;
		int stop=arr.length-1;
		int mid=(start+stop)/2;
		int find=11;
		while(start<=stop) {
			if(find<arr[mid]) {
				stop=mid-1;
			}else if(find==arr[mid]) {
				System.out.println(mid);
				return;
			}else {
				start=mid+1;
			}
			mid=(start+stop)/2;
		}
		System.out.println("Element not found");
	}
}
