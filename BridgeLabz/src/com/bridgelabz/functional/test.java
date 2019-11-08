package com.bridgelabz.functional;
import java.util.*;
public class test {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		while(num>0) {
			int i=num%2;
			System.out.print(i+" ");
			num=num/2;
		}

	}

}
