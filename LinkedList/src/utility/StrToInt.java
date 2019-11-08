package utility;

public class StrToInt 
{
	public static int stringToint(String str) 
	 {		 
		// TODO Auto-generated method stub
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
	}

}
