package com.bridgelabz.functional;
import java.util.*;
import com.bridgelabz.utility.Util;
public class Trig{
	public static void main(String[] args) {
		double angle;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter angle in degree");
		angle=sc.nextDouble();
		System.out.println("Sin of "+angle+" is "+Util.sin(angle));
		System.out.println("Sin of "+angle+" in Radian is "+Util.sin(Util.inRad(angle)));
		System.out.println("Cos of "+angle+" is "+Util.cos(angle));
		System.out.println("Cos of "+angle+" in Radian is "+Util.cos(Util.inRad(angle)));
	}
}
