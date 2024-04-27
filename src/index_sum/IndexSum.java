package index_sum;

import java.util.Scanner;

public class IndexSum {
	
	int sumOfAllElements(int[] arr) {
		int i, sum=0;
		for(i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	int evenIndexSum(int[] arr) {
		int i, sum=0;
		for(i=0; i<arr.length; i++) {
			if(i % 2 == 0) sum += arr[i];
		}
		return sum;
	}
	
	int oddIndexSum(int[] arr) {
		int i, sum=0;
		for(i=0; i<arr.length; i++) {
			if(i % 2 != 0) sum += arr[i];
		}
		return sum;
	}

	int firstLastIndexSum(int[] arr) {
		int sum=0;
		sum = arr[0] + arr[arr.length-1];
		return sum;
	}
	
	public static void main(String[] args) {

		int i;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Array size : ");

		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("\tEnter Array Elements");

		for (i = 0; i < size; i++) {

			System.out.print((i + 1) + " element : ");

			arr[i] = sc.nextInt();

		}

		System.out.print("\nArray is : [");
		
		for (i = 0; i < size; i++) {
			System.out.print(arr[i]);
			if (i != size - 1)
				System.out.print(", ");
		}
		
		IndexSum s = new IndexSum();
		System.out.println("\n\nEven Index Sum : " + s.evenIndexSum(arr));
		System.out.println("\nOdd Index Sum : " + s.oddIndexSum(arr));
		System.out.println("\nFirst and Last Index Sum : " + s.firstLastIndexSum(arr));
		System.out.println("\nSum Of all Elements : " + s.sumOfAllElements(arr));
		
		
	}
}
