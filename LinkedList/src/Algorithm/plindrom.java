package Algorithm;

import java.util.Scanner;

import utility.plindromtest;

public class plindrom 
{
	public static void main(String[] args)
	{
	System.out.println("Enter a number : ");
	
	int num = new Scanner(System.in).nextInt();
	
	int plindrom1 = plindromtest.plindrom1(num);
	
	}
}
