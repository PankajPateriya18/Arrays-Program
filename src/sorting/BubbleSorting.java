package sorting;

import java.util.Scanner;

public class BubbleSorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int i, j, tp;
		System.out.println("Enter Array Elements");
		for(i=0; i<arr.length; i++) {
			System.out.print((i+1) + " element : ");
			arr[i] = sc.nextInt();
		}
		for(i=0; i<arr.length-1; i++) {
			for(j=1; j<arr.length; j++) {
				if(arr[j-1] > arr[j]) {
					tp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] =  tp;	
				}
			}
		}
		System.out.print("Sorted Array is : ");
		for(i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
