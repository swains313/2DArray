package com.Array2d09sepetember2022;

import java.util.Scanner;

public class Multiply2matrix {

	public static void main(String[] args) {
		
		int x[][]=readMatrix();
		int y[][]=readMatrix();
		
		int mat[][]=isMultipy(x,y);
		
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				System.out.print(mat[i][j]+" ");
			}System.out.println();
		}
		

	}

	private static int[][] isMultipy(int[][] x, int[][] y) {
		
		if(x[0].length!=y.length || y[0].length!=x.length)
		{
			System.out.println("not possible ");
			return null;
		}
		
		int c[][]=new int[x.length][y[0].length];
		
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<y[0].length;j++)
			{
				for(int k=0;k<y.length;k++)
				{
					c[i][j]=c[i][j]+x[i][k]*y[k][j];
				}
			}
		}return c;
		
	}

	private static int[][] readMatrix() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter The No. of Row & column");
		int row=sc.nextInt();
		int col=sc.nextInt();
		
		int mat[][]=new int[row][col];
		
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}return mat;
			
	}

}
