package com.bridgelabz.functional;

import java.util.*;
public class DoubleOpt{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a,b,c;
		System.out.println("Enter Values of a,b and c");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		System.out.println("a+b*c= "+(a+b*c));
		System.out.println("a*b+c= "+(a*b+c));
		System.out.println("c+a/b= "+(c+a/b));
		System.out.println("a%b+c= "+(a%b+c));


}
}