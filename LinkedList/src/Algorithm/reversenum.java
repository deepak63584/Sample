package Algorithm;

import java.util.Scanner;

public class reversenum 
{
	public static void main(String args[])
	{
	int n, rev = 0;
	System.out.println("Enter the number:");
	Scanner in = new Scanner(System.in);
	n = in.nextInt();
	while( n != 0 )
	{
		rev = rev * 10;
		rev = rev + n%10;
		n = n/10;
	}
	System.out.println("The reversed value is: "+rev);
	}

}
