package array1;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Array size : ");
		
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("\tEnter Array Elements");
		
		for(int i=0; i<size; i++) {
			
			System.out.print((i+1)+" element : ");
			
			arr[i] = sc.nextInt();
			
		}
		
		System.out.print("\nArray is : [");
		int i;
		for(i=0; i<size; i++) {
			System.out.print(arr[i]);
			if(i != size-1) System.out.print(", ");
		}
		
		int rev[] = new int[size];
		
		int count=0;
		for(i=arr.length-1; i>=0; i--) {
			rev[count++] = arr[i];
		}
		
		System.out.print("]\nReversed Array is : [");
		
		for(i=0; i<rev.length; i++) {
			System.out.print(rev[i]);
			if(i != size-1) System.out.print(", ");
		}
		System.out.println("]");
	}
}
