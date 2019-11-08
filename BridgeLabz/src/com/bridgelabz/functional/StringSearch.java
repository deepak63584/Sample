package com.bridgelabz.functional;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class StringSearch {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string to be searched");
		String search=sc.nextLine();
		try {
			File f=new File("/home/admin97/Desktop/giridhar/BridgeLabz/src/com/bridgelabz/functional/file.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String s1;
			String str="";
			s1=br.readLine();
			while(s1!=null) {
				str=str+s1;
				s1=br.readLine();
			}
			str=str.toLowerCase();
			String str1[]=str.split(" ");
			int c=0;
			for(int i=0;i<str1.length;i++) {
				if(search.contains(str1[i])) {
					System.out.println("String found at "+i+" Position");
					c++;
				}	
			}
			if(c==0) {
				System.out.println("String not found in file");	
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
