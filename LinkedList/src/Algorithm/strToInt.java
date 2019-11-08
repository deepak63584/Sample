package Algorithm;

import java.util.Scanner;

import utility.StrToInt;

public class strToInt 
{

	 /*public static int stringToint( String str ) {
	      int i = 0; 
	      int number = 0;
	      boolean isNegative = false;
	      int len = str.length();
	      if( str.charAt(0) == '-' ){
	         isNegative = true;
	         i = 1;
	      }
	      while( i < len ){
	         number =number * 10;
	         number = number + ( str.charAt(i++) - '0' );
	      }
	      if( isNegative ) {
	        number = -number;
	      }
	      return number;
	   }*/   


	   public static void main (String args[])
	   {
	      String str = " ";
	      Scanner sc = new Scanner(System.in);
	      System.out.println("String value: " + str);
	      str = sc.nextLine();
	      int stringToint = StrToInt.stringToint(str);
	      System.out.println("int value: "+ stringToint);
	   }

}
