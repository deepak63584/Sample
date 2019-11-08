package utility;

public class anagramtest 
{
	public static boolean detectAnagram(String first,String second)
	{

		//If length of both words are not same then they are not anagram.
		if(first.length()!=second.length())
			return false;

		for(int i=0;i<second.length();i++)
		{
			char c=first.charAt(i);
			if(second.indexOf(c)==-1)
				return false;
		}

		return true;

	}
	
	public static void main(String[] args) 
	{
		anagramtest at = new anagramtest();
		
		String first = "earth";
		
		String second = "heart";
		
		System.out.println(detectAnagram(first,second)? "Words are Anagram" : "Words are not Anagram");
		
	}

}