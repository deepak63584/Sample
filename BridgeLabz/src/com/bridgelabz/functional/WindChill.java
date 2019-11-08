package com.bridgelabz.functional;
import java.util.*;
import com.bridgelabz.utility.Util;
public class WindChill{
	public static void main(String[] args) {
		double t,v,w;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of temperature in Fahrenheit(should be less than 50)");
		t=sc.nextDouble();
		System.out.println("Enter Value of wind speed in miles/hour(should be less than 120 nad greater than 3)");
		v=sc.nextDouble();
		if(t>50 || v>120 || v<3) {
			System.out.println("Enter valid values");
		}else {
			w=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
			System.out.println("National Whether Service defines the effective temperature to be "+w);
		}
		
	}
}

