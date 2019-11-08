package com.bridgelabz.utility;
public class Util{
	
	public static double avg(double arr[]) {
		double sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	
	public static double min(double arr[]) {
		double x=arr[0],y=arr[0];
		for(int i=0;i<arr.length;i++) {
			x=MIN(x,arr[i]);
		}
		return x;
	}
	
	public static double MIN(double x, double y) {
		return Math.min(x,y);
	}
	
	public static double max(double arr[]) {
		double x=arr[0],y=arr[0];
		for(int i=0;i<arr.length;i++) {
			x=MAX(x,arr[i]);
		}
		return x;
		
	}
	public static double MAX(double x,double y) {
		return Math.max(x, y);
	}
	
	public static double celsiusToFahrenheit(double temp) {
		return (temp*9/5)+32;
	}
	public static double fahrenheitToCelsius(double temp) {
		return (temp-32)*5/9;
	}
	public static double inRad(double angle) {
		return Math.toRadians(angle);
	}
	public static double sin(double angle) {
		return Math.sin(angle);
	}
	public static double cos(double angle) {
		return Math.cos(angle);
	}
	
	public static void isPrime(int num) {
		if(num<=2) {
			System.out.println(num);
		}else {
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					return;
				}
			}
			System.out.println(num);
		}
	}
	public static void isSpring(int day, int month) {
		if(((month==3 && day>=20)||(month ==6 && day <=20))||(month<6 && month>3)) {
			System.out.println("Spring Season");
		}else {
			System.out.println("Not Spring");
		}
	}
	public static void decimalToBinary(int num) {
		int[] res=new int[100];
		int rem,i=0;
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
	
	public static void merge(int arr[],int f,int m,int l) {
		int left=m-f+1;
		int right=l-m;
		int leftArray[]=new int[left];
		int rightArray[]=new int[right];
		for(int i=0;i<left;i++) {
			leftArray[i]=arr[f+i];
		}
		for(int j=0;j<right;j++) {
			rightArray[j]=arr[m+1+j];
		}
		
		int i=0,j=0,k=f;
		while(i<left&&j<right) {
			if(leftArray[i]<=rightArray[j]) {
				arr[k]=leftArray[i];
				i++;
			}else {
				arr[k]=rightArray[j];
				j++;
			}
			k++;
		}
		while(i<left) {
			arr[k]=leftArray[i];
			i++;
			k++;
		}
		while(j<right) {
			arr[k]=rightArray[j];
			j++;
			k++;
		}
	}
	
}