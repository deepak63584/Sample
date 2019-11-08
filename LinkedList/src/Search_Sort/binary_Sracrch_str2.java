package Search_Sort;

import java.util.Arrays;
import java.util.Scanner;

public class binary_Sracrch_str2 
{
	public static int binarySearch(String arr[],String str) 
	{
		int low = 0;
		boolean isPresent = false;
		
		int high = arr.length - 1;
		
		int mid = high / 2;
		
		while (high >= low) 
		{
			if (arr[mid].compareTo(str) == 0) 
			{
				isPresent = true;
				break;
			} 
			else if (arr[mid].compareTo(str) < 0) 
			{
				low = mid + 1;
				mid = (low + high) / 2;
			} 
			else if (arr[mid].compareTo(str) > 0) 
			{
				high = mid - 1;
				mid = (low + high) / 2;
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) 
	{
		String[] arr = { "abcd", "high", "new", "xyz" };
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string do you want to search : ");
		
		String str = sc.next();
		
		   int result = binarySearch(arr, str); 
		   
	        if (result == -1)
	        {
	        	System.out.println("String  is present");
	        } 
	        else 
	        {
	        	System.out.println("String is not present");
	        }
		}
		
}
