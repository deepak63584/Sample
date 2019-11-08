package com.bridgelabz.functional;
import java.util.*;
public class StopWatch{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long t1=0,t2=0;
		t1=start(t1);
		System.out.println("Time is running. write \"stop\" and press enter to stop and measure the time");
		String check=sc.nextLine();
		if("stop".equals(check)) {
			t2=stop(t2);
			System.out.println("Elapsed time is "+elapse(t1,t2));
		}
		
	}
	public static long start(long t1) {
		return t1=System.currentTimeMillis();
	}
	public static long stop(long t2) {
		return t2=System.currentTimeMillis();
	}
	public static long elapse(long t1, long t2) {
		return (t2-t1)/1000;
	}
}