package com.bridgelabz.functional;
import java.util.*;
public class HarmonicNumber{
	public static void main(String[] args) {
		double H=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input value");
		double input=sc.nextDouble();
		for(double i=1;i<=input;i++) {
			H+=(1/i);
		}
		System.out.println("Harmonic value of "+(int)input+" is "+H);
		
	}
}
