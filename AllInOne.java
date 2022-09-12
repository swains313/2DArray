package com.AllinOne;

import java.util.Scanner;

public class AllInOne {

	public static void main(String[] args) {

		int mat[][] = readMat();

		displayMat(mat);

		biggestMat(mat);
		smallestMat(mat);

		countEvenOdd(mat);

		System.out.println("after transpose ");
		int tra[][] = isTranspose(mat);
		displayMat(tra);

		System.out.println("row wise biggest ");
		int big[] = rowWiseBiggest(mat);
		for (int i = 0; i < big.length; i++) {
			System.out.print(big[i] + " ");
		}
		System.out.println();

		System.out.println("col wise biggest ");
		int big1[] = colWiseBiggest(mat);
		for (int i = 0; i < big1.length; i++) {
			System.out.print(big1[i] + " ");
		}

		System.out.println("col wise reverse ");
		int[][] rev1 = colWiseReverse(mat);
		displayMat(rev1);

		System.out.println("row wise reverse ");
		int[][] rev2 = rowWiseReverse(mat);
		displayMat(rev2);

		System.out.println("primary diagonal reverse ");
		diagonalWiseReverse(mat);

	}

	private static void diagonalWiseReverse(int[][] mat) {

		for (int i = 0; i < mat.length / 2; i++) {
			int temp = mat[i][i];
			mat[i][i] = mat[mat.length - 1 - i][mat.length - 1 - i];
			mat[mat.length - 1 - i][mat.length - 1 - i] = temp;

			temp = mat[i][mat.length - 1 - i];
			mat[i][mat.length - 1 - i] = mat[mat.length - 1 - i][i];
			mat[mat.length - 1 - i][i] = temp;
		}
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static int[][] rowWiseReverse(int[][] mat) {

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length / 2; j++) {
				int temp = mat[i][j];
				mat[i][j] = mat[i][mat.length - 1 - j];
				mat[i][mat.length - 1 - j] = temp;

			}
		}
		return mat;

	}

	private static int[][] colWiseReverse(int[][] mat) {
		for (int i = 0; i < mat.length / 2; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				int temp = mat[i][j];
				mat[i][j] = mat[mat.length - 1 - i][j];
				mat[mat.length - 1 - i][j] = temp;
				;
			}
		}
		return mat;
	}

	private static int[] colWiseBiggest(int[][] mat) {
		int big[] = new int[mat[0].length];
		for (int i = 0; i < mat[0].length; i++) {
			int bg = mat[0][i];
			for (int j = 0; j < mat.length; j++) {
				if (mat[j][i] > bg)
					bg = mat[j][i];
			}
			big[i] = bg;
		}
		return big;
	}

	private static int[] rowWiseBiggest(int[][] mat) {

		int big[] = new int[mat.length];
		for (int i = 0; i < mat.length; i++) {
			int bg = mat[i][0];

			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] > bg)
					bg = mat[i][j];
			}
			big[i] = bg;
		}
		return big;

	}

	private static int[][] isTranspose(int[][] mat) {

		int tra[][] = new int[mat[0].length][mat.length];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				tra[j][i] = mat[i][j];
			}
		}
		return tra;

	}

	private static void countEvenOdd(int[][] mat) {

		int ec = 0, oc = 0;

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] % 2 == 0)
					ec++;
				else
					oc++;
			}
		}
		System.out.println("total even  number in matrix " + ec);
		System.out.println("total odd number in matrix " + oc);

	}

	private static void smallestMat(int[][] mat) {

		int small = mat[0][0];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < small)
					small = mat[i][j];
			}
		}
		System.out.println("the smallest number in matrix " + small);

	}

	private static void biggestMat(int[][] mat) {
		int big = mat[0][0];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] > big)
					big = mat[i][j];
			}
		}
		System.out.println("the biggest number in matrix " + big);

	}

	private static void displayMat(int[][] mat1) {

		System.out.println("user entered matrix ");

		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1[i].length; j++) {
				System.out.print(mat1[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static int[][] readMat() {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter The number number of row & column ");
		int row = sc.nextInt();
		int col = sc.nextInt();

		int mat[][] = new int[row][col];
		System.out.println("enter " + row * col + " values ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		return mat;
	}

}
