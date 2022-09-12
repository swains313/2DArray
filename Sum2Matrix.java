package com.Array2d07september2022;

public class Sum2Matrix {

	public static void main(String[] args) {
		
		Matrix mat=new Matrix();
		int x[][]=mat.readMatrix();
		int y[][]=mat.readMatrix();
		
	
		mat.Display(x);
		mat.Display(y);
		
		System.out.println("after merged");
		int z[][]=isMerged(x,y);
		
		for(int i=0;i<z.length;i++)
		{
			for(int j=0;j<z[i].length;j++)
			{
				System.out.print(z[i][j]+" ");
			}
			System.out.println();
		}
		
	

	}
	
	static int[][] isMerged(int [][]x, int y[][])
	{
		int sum[][]=new int[x.length][y.length];
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<y[i].length;j++)
			{
				sum[i][j]=x[i][j]+y[i][j];
			}	
		}
		return sum;
	}

}
