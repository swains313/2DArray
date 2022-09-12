package com.Array2d09sepetember2022;

import java.util.Scanner;

public class DiagnosalReverse {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("enter The No. Of Row & Column ");
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
		System.out.println("user Entered Matrix : ");
		displayMatrix(mat);
		
		
		System.out.println("after reverse primary diagnoal ");
		reverseDiagnoal(mat);
		
	}

	private static void reverseDiagnoal(int[][] mat) {
		
		
		for(int i=0;i<mat.length/2;i++)
		{
			
			//primary diagnosal
			int temp=mat[i][i];
			mat[i][i]=mat[mat.length-1-i][mat.length-1-i];
			mat[mat.length-1-i][mat.length-1-i]=temp;
			
			//secondary diagnosal
			temp=mat[i][mat.length-1-i];
			mat[i][mat.length-1-i]=mat[mat.length-1-i][i];
			mat[mat.length-1-i][i]=temp;
			
		}
		
	
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
	}

	

private static void displayMatrix(int[][] mat) {
	
	
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
