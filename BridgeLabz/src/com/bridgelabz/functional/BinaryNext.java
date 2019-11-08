package com.bridgelabz.functional;
import java.util.*;
public class BinaryNext{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int limit=10;
		System.out.print(sin(90,limit));
		
	}
	public static double sin(double x,int lim) {
		x=x%(2*Math.PI);
		double res=x;
		for(int i=1;i<=lim;i=i+2) {
			if(res>=0) {
				res=res+(Math.pow(x, i)/fact(i));
			}else if(res<0) {
				res=res-(Math.pow(x, i)/fact(i));
			}
		}
		return res;
	}
	public static double cos(double x,int lim) {
		x=x%(2*Math.PI);
		double res=x;
		for(int i=0;i<=lim;i=i+2) {
			if(res>=0) {
				res=res+(Math.pow(x, i)/fact(i));
			}else if(res<0) {
				res=res-(Math.pow(x, i)/fact(i));
			}
		}
		return res;
	}
	
	public static int fact(int num) {
		int res=1;
		for(int i=num;i>0;i--) {
			res=res*i;
		}
		return res;
	}
}