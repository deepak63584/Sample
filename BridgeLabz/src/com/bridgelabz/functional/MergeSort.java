package com.bridgelabz.functional;
import java.util.*;
import com.bridgelabz.utility.Util;
public class MergeSort {
	public static void main(String[] args) {
		int arr[]= {2,7,5,71,65,12,86,34,47,3,9};
		int f=0,l=arr.length-1,m=(f+l)/2;
		
		sort(arr,f,l);
		System.out.println(Arrays.toString(arr));
		
	}
	static public void sort(int arr[],int f,int l) {
		if(f<l) {
			int m=(f+l)/2;
			sort(arr,f,m);
			sort(arr,m+1,l);
			Util.merge(arr,f,m,l);
		}
	}
	
}
