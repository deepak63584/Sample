package com.bridgelabz.functional;
import java.util.*;
import com.bridgelabz.utility.Util;
public class Prime{
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range of numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		for(int i=a;i<=b;i++) {
			Util.isPrime(i);
		}
	}
}
