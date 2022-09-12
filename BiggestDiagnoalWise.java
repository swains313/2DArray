package com.Array2d09sepetember2022;

import java.util.Scanner;

public class BiggestDiagnoalWise {
	
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
	
	int z[]=IsBiggest(mat);
	
	System.out.println("biggest in primary daigonal "+z[0]);
	System.out.println("biggest in secondary diagonal "+z[1]);
}

private static int[] IsBiggest(int[][] mat) {
	
	int pbig=mat[0][0],sbig=mat[0][mat.length-1];
	for(int i=0;i<mat.length;i++)
	{
		
		if(mat[i][i]>pbig)
			pbig=mat[i][i];
		if(mat[i][mat.length-1-i]>sbig)
			sbig=mat[i][mat.length-1-i];
	}return new int[] {pbig,sbig};
	
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
