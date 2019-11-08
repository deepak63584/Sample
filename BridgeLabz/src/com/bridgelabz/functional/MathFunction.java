package com.bridgelabz.functional;
import java.util.*;
public class MathFunction{

	public static double harmonic(int num) {
		double sum=0;
		for(double i=1;i<=num;i++) {
			sum=sum+(1/i);
		}
		return sum;
	}
	
	public static double sin(double angle) {
		angle=angle*(Math.PI/180);
		return Math.sin(angle);
	}
	
	public static double cos(double angle) {
		angle=angle*(Math.PI/180);
		return Math.cos(angle);
	}
	
	public static void binary(int num) {
		int[] res=new int[10];
		int i=0;
		while(num>0) {
			res[i]=num%2;
			num=num/2;
			i++;
		}
		for(int j=i-1;j>=0;j--) {
			if((j%4)-3==0) {
				System.out.print(" ");	
			}
		System.out.print(res[j]);	
		}
	}
	
	public static int factorial(int num) {
		int res=1;
		for(int i=1;i<=num;i++) {
			res=res*i;
		}
		return res;
	}
	
	public static double sqrt(double c) {
		double epsilon=1e-15;
		double t=c;
		t=((c/t)+t)/2;
		while(Math.abs(t-c/t)>epsilon){
			t=((c/t)+t)/2;
		}
		return t;
	}
	
	public static boolean isPrime(int num) {
		if(num<=2) return true;
		for(int i=2;i<num;i++) {
			if(num%i==0) return false;
		}
		return true;
	}
	
	public static double futureValue(double c,double intrest,int years) {
		return Math.floor(c*Math.pow((1+intrest),years));
	}
	
	public static double presentValue(double c,double intrest) {
		// we have to calculate value at present time, so years(time period) is 0
		return c/(Math.pow((1+intrest), 0));
	}
	
	public static int minValue(int[] arr) {
		int res=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(res>arr[i]) res=arr[i];
		}
		return res;
	}
	
	public static int maxValue(int[] arr) {
		int x=arr[0];
		for(int i=0;i<arr.length;i++) {
			x=max(x,arr[i]);
		}
		return x;
	}
	public static int max(int x, int y) {
		return Math.max(x, y);
	}
	
	public static boolean checkCollinearUsingSlope(int[] a,int[] b, int[] c){
		double ab=(b[1]-a[1])/(b[0]-a[0]);
		double bc=(c[1]-b[1])/(c[0]-b[0]);
		double ac=(c[1]-a[1])/(c[0]-a[0]);
		if(ab==bc && bc==ac){
			return true;
		}
		return false;
	}
	
	public static boolean checkCollinearUsingArea(int[] a,int[] b,int[] c) {
		double a1=a[0]-b[0];
		double b1=b[0]-c[0];
		double c1=a[1]-b[1];
		double d1=b[1]-c[1];
		if((a1*d1-b1*c1)/2 ==0) return true;
		return false;
	}
	
	
}
