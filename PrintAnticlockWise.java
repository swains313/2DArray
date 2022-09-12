package com.Array2d09sepetember2022;

import java.util.Scanner;

public class PrintAnticlockWise {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter The Row and column");
		int row=sc.nextInt();
		int col=sc.nextInt();
		
		int mat[][]=new int[row][col];
		
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
		 printSpiral(mat);

	}

	private static void printSpiral(int[][] mat) {
		
		int n=mat.length;
		for(int i=0,j=n-1;i<j;i++,j--)
		{
			for(int k=i;k<j;k++)
			System.out.print(mat[k][i]+" ");
			for(int k=i;k<j;k++)
			System.out.print(mat[j][k]+" ");
			for(int k=j;k>i;k--)
			System.out.print(mat[k][j]+" ");
			for(int k=j;k>i;k--)
			System.out.print(mat[i][k]+" ");
		}
		if(n%2==1)
			System.out.print(mat[n/2][n/2]);
		
	}


}
