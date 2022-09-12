package com.Array2d09sepetember2022;

import java.util.Scanner;

public class ColumnWiseReverse {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter The Number Of row & column ");
		int row=sc.nextInt();
		int col=sc.nextInt();
		
		int mat[][]=new int[row][col];
		
		System.out.println("enter "+row*col+" Vlues ");
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("user entered matrix ");
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
	ColumnWiseReverse(mat);
	

	}

	private static void ColumnWiseReverse(int[][] mat) {
		
		
		for(int i=0;i<mat.length/2;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				int temp=mat[i][j];
				mat[i][j]=mat[mat[i].length-1-i][j];
				mat[mat[i].length-1-i][j]=temp;
			}
		}
		
		
		System.out.println("efter reverse column array ");
		
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
