package check;

import java.util.Scanner;

public class Check {
	
	static void check(int[] arr) {
		arr = null;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter Array Elements");
		int i;
		for(i=0; i<size; i++) {
			System.out.print((i+1) + " element : ");
			arr[i] = sc.nextInt();
		}
		check(arr);
		System.out.print("Array is : ");
		for(i=0; i<size; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
