package com.bridgelabz.functional;
import java.util.*;
import com.bridgelabz.utility.Util;
public class Binary{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Decimal Number");
		int dec=sc.nextInt();
		Util.decimalToBinary(dec);
	}
}