package com.bridgelabz.functional;
import java.util.*;
public class bubbleSort {
	public static void main(String[] args) {
		int arr[]= {2,7,3,9,11,45,78,3,4,7};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					arr[j]=arr[j]+arr[j+1];
					arr[j+1]=arr[j]-arr[j+1];
					arr[j]=arr[j]-arr[j+1];
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
