package Algorithm;

public class factorial 
{
	public static int factorial(int n)
	 {  
		 int number=8;//It is the number to calculate factorial
		 
		 int factorial=1;
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1)); 
	 }
	 
	 
	 public static void main(String args[])
	 { 
		 int number=8;//It is the number to calculate factorial 
		 
		 int factorial = factorial(number);  
		 
		 System.out.println("Factorial of "+number+" is: "+factorial);   
	  }  
}
