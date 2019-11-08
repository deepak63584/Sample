package com.bridgelabz.functional;
import java.util.*;
import com.bridgelabz.utility.Util;
public class TemperaturConversion{
	public static void main(String[] args) {
		int mode;
		double temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter \n 1 for Celsius to Fahrenheit mode \n 2 for Fahrenheit to Celsius  mode");
		mode=sc.nextInt();
		if(mode==1) {
			System.out.println("Enter Temperature");
			temp=sc.nextDouble();
			System.out.println(temp+" Celsius = "+Util.celsiusToFahrenheit(temp)+" Fahrenheit");
		}else if(mode==2) {
			System.out.println("Enter Temperature");
			temp=sc.nextDouble();
			System.out.println(temp+" Fahrenheit = "+Util.fahrenheitToCelsius(temp)+" Celsius");
		}else {
			System.out.println("Enter Valid Mode");
		}
	}
}
