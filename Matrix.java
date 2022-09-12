package com.Array2d07september2022;
import java.util.Scanner;
public class Matrix {

	
	//Read The Matrix From The User 
	int [][] readMatrix()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter The no. of row and column (mtrix) : ");
		int row=sc.nextInt();
		int col=sc.nextInt();
		
		int mat[][]=new int[row][col];
		
		System.out.println("enter "+row*col+" values ");
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		return mat;
	}
	

	//Display User Entered Matrix
	public void Display(int[][] mat) 
	{	
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}	
	}
	

	//Display Biggest number In User Entered Matrix
	public int biggestNumber(int[][] mat) {
		// TODO Auto-generated method stub
		
		int big=mat[0][0];
		
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				if(mat[i][j]>big)
					big=mat[i][j];
			}
		}
		return big;
	}


	//Display Smallest Number User Entered Matrix
	public int smallestNumber(int[][] mat) {
		
		int small=mat[0][0];
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				if(mat[i][j]<small)
					small=mat[i][j];
			}
		}
		return small;
	}


	public int[] countEO(int[][] mat) {
		
		int ec=0,oc=0;
		
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				if(mat[i][j]%2==0)
					ec++;
				else
					oc++;
			}
		}
		return new int[] {ec,oc};
	}


	public int[][] transporent(int[][] mat) {
		
		int ar[][]=new int[mat[0].length][mat.length];
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				ar[j][i]=mat[i][j];
			}
		}
		return ar;
	}

}
