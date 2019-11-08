package com.bridgelabz.functional;
import java.util.*;
public class FlipCoin{
	public static void main(String[] args) {
		int input,heads = 0,tails=0;
		double headper,tailper;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of times you want to flip a coin");
		input=sc.nextInt();
		for(int i=0;i<input;i++) {
			double random=Math.random();
			if(random >= 0.5) {
				heads++;
			}else {
				tails++;
			}
		}
		headper=Math.round(((double) heads*100)/(double)input);
		tailper=Math.round(((double)tails*100)/(double)input);
		System.out.println("Percentage of Heads to Tails are "+headper+"/"+tailper);
	}
}