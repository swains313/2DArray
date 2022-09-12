package com.Array2d09sepetember2022;

import java.util.Scanner;

public class ColumnWiseBiggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
	int big[]=columnWiseBiggest(mat);
	
	for(int i=0;i<big.length;i++)
	{
		System.out.println("the biggest number column wise is "+big[i]);
	}
	
	}

	private static int[] columnWiseBiggest(int[][] mat) {
		
		int big[]=new int[mat[0].length];
		for(int i=0;i<mat[0].length;i++)
		{
			int bg=mat[0][i];
			
			for(int j=0;j<mat.length;j++)
			{
				if(mat[j][i]>bg)
					bg=mat[j][i];
			}
			big[i]=bg;
		}
		
		return big;
	}
	
	


}
