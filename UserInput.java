package com.Array2d07september2022;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the no. of row and column : ");
		int row=sc.nextInt();
		int column=sc.nextInt();
		
		int mat[][]=new int[row][column];
		System.out.println(mat.length);
		System.out.println(mat[1].length);
		System.out.println("enter the "+row*column+" number row wise ");
		
		System.out.println(mat.length);
		System.out.println(mat[0].length);
		System.out.println(mat[1].length);
	//	System.out.println(mat[2].length);		
		System.out.println("------");
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}			
	System.out.println(mat.length+" ------------");
	
		System.out.println("user mattrix is : ");
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			
			System.out.println();
		}
		
	//	System.out.println(mat[2][0]);
		
	}

}
