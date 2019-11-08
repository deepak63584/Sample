package com.bridgelabz.functional;

public class NoSuchMethod{
	public static void main(String[] args) {
		try {
			throw new NoSuchMethodError();
		}
		catch(Exception ex) {
			ex.printStackTrace();		}
	}
}