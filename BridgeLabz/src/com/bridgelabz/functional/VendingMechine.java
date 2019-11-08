package com.bridgelabz.functional;
import java.util.*;
public class VendingMechine {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter amount");
	int amount=sc.nextInt();
	int notes[]= {1000,500,100,50,20,10,5,2,1};
	int note[]=new int[10];
	int size=0;
	for(int i=0;i<notes.length;i++) {
		if(amount>=notes[i]) {
			note[i]=amount/notes[i];
			if(amount!=0) {
				System.out.println("Notes of "+notes[i]+" are "+note[i]);
				
			}
		}
		amount=amount-(notes[i]*note[i]);
		size+=note[i];
	}
	System.out.println("Minimum "+size+" required");
	}
}
