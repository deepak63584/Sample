package com.bridgelabz.functional;
import java.util.*;
public class SumOfThree{
	public static void main(String[] args) {
		int[] a= {1,3,-1,-6,-3,6,9,3,-2,-1,4,2,6};
		int c=0;
		for(int i=0;i<a.length-2;i++) {
			for(int j=i+1;j<a.length-1;j++) {
				for(int k=j+1;k<a.length;k++) {
					if(a[i]+a[j]+a[k]==0) {
						System.out.print(a[i]+" "+a[j]+" "+a[k]);
						System.out.println();
						c++;
					}
				}
			}
	}
		System.out.println("There are total "+c+" distinct triplets");
}
}