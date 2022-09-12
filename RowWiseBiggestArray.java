package com.Array2d09sepetember2022;

import java.util.Scanner;

public class RowWiseBiggestArray {

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
		
	int big[]=rowWiseBiggest(mat);
	
	for(int i=0;i<big.length;i++)
	{
		System.out.println("the biggest number row wise is "+big[i]);
	}
	
	
		
		}
	
	static int[] rowWiseBiggest(int [][]mat)
	{
		int big[]=new int[mat.length];
		
		for(int i=0;i<mat.length;i++)
		{
			int bg=mat[i][0];
			for(int j=0;j<mat[i].length;j++)
			{
				if(mat[i][j]>bg)
					bg=mat[i][j];
			}
			big[i]=bg;
		}return big;
	}
	
	

}
