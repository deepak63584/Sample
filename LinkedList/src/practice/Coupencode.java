package practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Coupencode 
{
	public static void main(String[] args) 
	{
		int n = 10;
		
		HashSet hs = new HashSet();
		
		char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
		
		String str = " ";
		
		Random random = new Random();
		
		for(int i = 0; i < n; i++ )
		{
			for(int j = 0; j < 10; j++)
			{
				char c = chars[random.nextInt(chars.length)];
				
				str = str + c;
			}
			hs.add(str);
			
			str = " ";
		}
		Iterator it = hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println("Coupens Generate: "+it.next());
		}
		
	}
	
	
	
	
	
	
	
	/*public static void main(String[] args) {
	    int c;
	    Random t = new Random();
	 
	    // random integers in [0, 100]
	 
	    for (c = 1; c <= 10; c++) {
	      System.out.println(t.nextInt(100));
	    }
	  }*/

}
