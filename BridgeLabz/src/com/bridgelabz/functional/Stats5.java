package com.bridgelabz.functional;
import java.util.*;
import com.bridgelabz.utility.Util;
public class Stats5{
	public static void main(String[] args) {
		double[] arr= new double[5];		
		for(int i=0;i<5;i++) {
		arr[i]=Math.random()*1+0;
		
			}
		System.out.println("Array of no. is "+(Arrays.toString(arr)));
		System.out.println("Average value of array elements is "+(Util.avg(arr)));
		System.out.println("Minimun value among the array elements is "+(Util.min(arr)));
		System.out.println("Maximun value among the array elements is "+(Util.max(arr)));
	
} 	
}