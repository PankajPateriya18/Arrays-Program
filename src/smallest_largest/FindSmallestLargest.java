package smallest_largest;

import java.util.Arrays;
import java.util.Scanner;

public class FindSmallestLargest {
	
	int findSmallest(int[] ar) {
		int i, sm = ar[0];
		for(i=0; i<ar.length; i++) {
			if(sm > ar[i]) sm = ar[i];
		}
		return sm;
	}
	
	int findSecondSmallest(int[] ar) {
		int i, ss = ar[0];
		Arrays.sort(ar);
		for(i=0; i<ar.length; i++) {
			if(ar[i] != ar[i+1]) {
				ss = ar[i+1];
				break;
			}
		}
		return ss;
	}
	
	int findLargest(int[] ar) {
		int i, l = ar[0];
		for(i=0; i<ar.length; i++) {
			if(l < ar[i]) l = ar[i];
		}
		return l;
	}
	
	int findSecondLargest(int[] ar) {
		int i, sl = ar[0];
		Arrays.sort(ar);
		for(i=ar.length-1; i>=0; i--) {
			if(ar[i] != ar[i-1]) {
				 sl = ar[i-1];
				 break;
			}
		}
		return sl;
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
		System.out.println("]");
		
		FindSmallestLargest f = new FindSmallestLargest();
		
		System.out.println("Smallest Element : " + f.findSmallest(arr));
		System.out.println("Second Smallest Element : " + f.findSecondSmallest(arr));
		System.out.println("Largest Element : " + f.findLargest(arr));
		System.out.println("Find Second Largest : " + f.findSecondLargest(arr));

	}
}
