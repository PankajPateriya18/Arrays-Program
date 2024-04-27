package check;

import java.util.Scanner;

public class CheckArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Array Row Size : ");
		int rSize = sc.nextInt();
		System.out.print("Enter Array Column Size : ");
		int cSize = sc.nextInt();
		int[][] arr = new int[rSize][cSize];
		int r = arr.length;
		int c = arr[0].length;
		System.out.println("R - " + r);
		System.out.println("C - " + c);
	}
}
