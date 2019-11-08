package Algorithm;

import java.util.ArrayList;
import java.util.List;

public class primefactor 
{
	public static List<Integer> primeFactors(long number) {
        List<Integer> primefactors = new ArrayList<>();
        long copyOfInput = number;

        for (int i = 2; i <= copyOfInput; i++) {
            if (copyOfInput % i == 0) {
                primefactors.add(i); // prime factor
                copyOfInput /= i;
                i--;
            }
        }
        
        return primefactors;
    }
	
	public static void main(String[] args) 
	{
		 System.out.printf("Prime factors of number '%d' are : %s %n", 35, primeFactors(35));
	        System.out.printf("Prime factors of integer '%d' are : %s %n", 72, primeFactors(72));
	        System.out.printf("Prime factors of positive number '%d' is : %s %n", 189, primeFactors(189));
	        System.out.printf("Prime factors of number '%d' are as follows : %s %n", 232321, primeFactors(232321));
	        System.out.printf("Prime factors of number '%d' are as follows : %s %n", 67232321, primeFactors(67232321));
		
	}

}
