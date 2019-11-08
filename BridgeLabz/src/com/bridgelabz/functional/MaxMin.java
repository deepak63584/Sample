package com.bridgelabz.functional;
import java.util.*;
public class MaxMin {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter numbers to find Max and Min");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Max value is "+MathFunction.maxValue(arr));
		System.out.println("Min value is "+MathFunction.minValue(arr));
	}
}
