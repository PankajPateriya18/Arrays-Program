package row_column_diagonal_sum;

import java.util.Scanner;

class RowSum {
	static int[] doRowSum(int[][] arr) {
		int[] count = new int[arr.length];
		int i, j, sum;
		for(i=0; i<arr.length; i++) {
			sum = 0;
			for(j=0; j<arr[0].length; j++) {
				sum += arr[i][j];
			}
			count[i] = sum;
		}
		return count;
	}
}

class ColumnSum {
	static int[] doColumnSum(int[][] arr) {
		int[] count = new int[arr[0].length];
		int i, j, sum;
		for(i=0; i<arr[0].length; i++) {
			sum = 0;
			for(j=0; j<arr.length; j++) {
				sum += arr[j][i];
			}
			count[i] = sum;
		}
		return count;
	}
}

class DiagonalSum {
	static int doDiagonalSum(int[][] arr) {
		
		int i, j, sum=0;
		for(i=0; i<arr.length; i++) {
			
			for(j=0; j<arr[i].length; j++) {
				if(i == j) {
					sum += arr[i][j];
				}
			}
			
		}

		return sum;
	}
}

public class Sum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Array Row Size : ");
		int rSize = sc.nextInt();
		System.out.print("Enter Array Column Size : ");
		int cSize = sc.nextInt();
		int[][] arr = new int[rSize][cSize];
		System.out.println("Enter Array Elements");
		int i, j;
		for(i=0; i<rSize; i++) {
			for(j=0; j<cSize; j++) {
				System.out.print((i+1)+"-"+(j+1) + " element : ");
				arr[i][j] = sc.nextInt();
			}
		}
		int[] rSum = RowSum.doRowSum(arr);
		int[] cSum = ColumnSum.doColumnSum(arr);
		int dSum = DiagonalSum.doDiagonalSum(arr);
		System.out.println("2-D Array is : ");
		for(i=0; i<rSize; i++) {
			System.out.print("\t\t[");
			for(j=0; j<cSize; j++) {
				System.out.print(arr[i][j]);
				if(j != cSize-1) System.out.print(", ");
			}
			System.out.println("]  " + rSum[i]);
		}
		System.out.print("\t\t ");
		for(i=0; i<cSum.length; i++) {
			System.out.print(cSum[i]);
			if(i != cSum.length) System.out.print(", ");
		}
		System.out.println("\nDiagonal Sum is : " + dSum);	
	}
}
