package com.Array2d07september2022;

public class MainMatrix {

	public static void main(String[] args) {
	
		Matrix mt=new Matrix();
		int mat[][]=mt.readMatrix();
		
		System.out.println("user enter matrix is ");
		mt.Display(mat);
		
		System.out.println("biggest  Matrix is : "+mt.biggestNumber(mat));
		System.out.println("smallest Matrix is : "+mt.smallestNumber(mat));
		
		int []c=mt.countEO(mat);
		System.out.println("even Number Present In Matrix Is "+c[0]);
		System.out.println("odd  Number present In Matrix Is "+c[1]);
		
		System.out.println("after Transporent");
		int trans[][]=mt.transporent(mat);
		mt.Display(trans);
		
		
		
		

	}

}
