package com.bridgelabz.functional;
import java.util.*;
public class RollDie{
	public static void main(String[] args) {
		twoD(3,3);

	}
	public static int[][] twoD(int row, int col) {
		int[][] arr=new int[row][col];
		int count=1;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=(int)(Math.random()*5+1);
				System.out.print(count+"->"+arr[i][j]+" ");
				count++;
			}
			System.out.println();
		}
		return arr;
	}
}