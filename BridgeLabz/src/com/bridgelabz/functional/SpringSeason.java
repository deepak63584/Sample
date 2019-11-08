package com.bridgelabz.functional;
import java.util.*;
import com.bridgelabz.utility.Util;
public class SpringSeason{
	public static void main(String[] args) {
		String[] months= {"Jan","Feb","Mar","Apr","May","June","July","Aug","Sept","Oct","Nov","Dec"};
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter date");
		int day=sc.nextInt();
		String mon=sc.next();
		int month=Arrays.asList(months).indexOf(mon)+1;
		Util.isSpring(day,month);
		
	}
}
