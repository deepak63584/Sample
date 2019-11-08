package utility;

public class plindromtest 
{
	public static int plindrom1(int num) 
	{
		int number=0;
		int rev=0;
		while (number != 0)
		{
		int rem = number % 10;
		rev = rev * 10 + rem;
		number = number / 10;
		}
		if(number == rev)
		System.out.println("it is a Palindrome number");
		else
		System.out.println("it is Not a Palindrome number");
		return number;
	}

}
