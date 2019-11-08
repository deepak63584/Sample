package com.bridgelabz.functional;

public class Armstrong {
	public static void main(String[] args) {
		for(int i=0;i<1000;i++) {
			int sum=0,b,c,j;
			c=i;
			j=i;
			while(j>0) {
				b=j%10;
				sum=sum+(b*b*b);
				j=j/10;
			}
			if(c==sum) {
				System.out.println("Armstrong "+i);
			}
		}
	}

}
