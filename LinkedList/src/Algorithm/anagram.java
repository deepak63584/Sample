package Algorithm;

import java.util.Scanner;

public class anagram
{
	public static boolean detectAnagram(String first,String second)
	{
		
		//If length of both words are not same then they are not anagram.
		if(first.length()!=second.length())
			return false;

		for(int i=0;i<second.length();i++){
			char c=first.charAt(i);
			if(second.indexOf(c)==-1)
				return false;
		}
		return true;
	}

	public static void main(String args[])
	{
	
		Scanner am = new Scanner(System.in);
		
		System.out.println("Enter first word: ");
		String first= am.nextLine();
		System.out.println("Enter Second word");
		String second= am.nextLine();
		System.out.println(detectAnagram(first,second)? "Words are Anagram" : "Words are not Anagram");
		
		}
}
