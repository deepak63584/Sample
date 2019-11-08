package com.bridgelabz.functional;
import java.util.*;
public class PowerOf2{
	public static void main(String[] args) {
		System.out.println("Enter the power of 2");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		for(int i=0;i<=input;i++) {
			System.out.println("2^"+i+" is "+Math.pow(2, i));
		}
	}
}