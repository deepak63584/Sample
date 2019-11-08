package com.bridgelabz.functional;
import java.util.*;
public class PrintThreeNames{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str[]=new String[3];
	System.out.println("Enter Three Names");
	str[0]=sc.nextLine();
	str[1]=sc.nextLine();
	str[2]=sc.nextLine();
	System.out.print("HI");
	for(int i=str.length-1;i>=0;i--){
	System.out.print(" "+str[i]);
	}
}
}
