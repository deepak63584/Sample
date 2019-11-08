package com.bridgelabz.functional;

import java.util.*;
public class IntOpt{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter Values of a,b and c");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		System.out.println("a+b*c= "+(a+b*c));
		System.out.println("a*b+c= "+(a*b+c));
		System.out.println("c+a/b= "+(c+a/b));
		System.out.println("a%b+c= "+(a%b+c));


}
}