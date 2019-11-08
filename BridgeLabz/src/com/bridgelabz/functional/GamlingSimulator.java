package com.bridgelabz.functional;
import java.util.*;
public class GamlingSimulator{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter stake");
		int stake=sc.nextInt();
		System.out.println("Enter goal");
		int goal=sc.nextInt();
		System.out.println("Enter trails");
		int trails=sc.nextInt();
		int win=0,lost=0;
		for(int i=1;i<=trails;i++) {
			double ran=Math.random();
			if(ran>0.5) {
				win++;
				stake++;
			}else {
				stake--;
			}
			if(stake==0) {
				System.out.println("You lost at "+i);
				System.out.println("You lost "+(i-win)+" times");
				return;
			}else if(stake == goal) {
				System.out.println("You won at "+i);
				System.out.println("You won "+win+" times");
				return;
			}
		}
	}
}
