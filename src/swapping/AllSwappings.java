package swapping;

import java.util.Scanner;

public class AllSwappings {
	
	int[] eachTwoIndexSwapping(int [] arr) {
		if(arr.length < 2) return new int[] {arr[0]};
		int i, tp;
		
		int[] brr = new int[arr.length];
		
		for(i=0; i<arr.length; i++) {
			brr[i] = arr[i];
		}
		
		
		for(i=0; i<brr.length; i=i+2) {
			tp = brr[i];
			brr[i] = brr[i+1];
			brr[i+1] = tp;
		}
		
		return brr;
	}
	
	int[] eachThreeIndexSwapping(int [] arr) {
		if(arr.length < 3) return new int[] {arr[0]};
		int i, tp;
		
		int[] brr = new int[arr.length];
		
		for(i=0; i<arr.length; i++) {
			brr[i] = arr[i];
		}
		
		
		for(i=0; i<brr.length; i=i+3) {
		    tp = brr[i];
			brr[i] = brr[i+2];
			brr[i+2] = tp;
		}
		
		return brr;
	}
	
	int[] reverseArrayBySwapping(int [] arr) {
		if(arr.length < 2) return new int[] {arr[0]};
		int i, tp;
		
		int[] brr = new int[arr.length];
		
		for(i=0; i<arr.length; i++) {
			brr[i] = arr[i];
		}
		
		
		for(i=0; i<brr.length/2; i++) {
		    tp = brr[i];
			brr[i] = brr[brr.length-1-i];
			brr[brr.length-1-i] = tp;
		}
		
		return brr;
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
		
		int[] tp;
		AllSwappings as = new AllSwappings();
		System.out.print("\nAfter Swapping Every Two Index : [" );
		tp = as.eachTwoIndexSwapping(arr);
		for(i=0; i<tp.length; i++) {
			System.out.print(tp[i]);
			if(i != tp.length-1) System.out.print(", ");
		}System.out.println("]");
		
		System.out.print("\nAfter Swapping Every Three Index : [" );
		tp = as.eachThreeIndexSwapping(arr);
		for(i=0; i<tp.length; i++) {
			System.out.print(tp[i]);
			if(i != tp.length-1) System.out.print(", ");
		}System.out.println("]");
		
		System.out.print("\nAfter Swapping Reverse Array : [" );
		tp = as.reverseArrayBySwapping(arr);
		for(i=0; i<tp.length; i++) {
			System.out.print(tp[i]);
			if(i != tp.length-1) System.out.print(", ");
		}System.out.println("]");
		
	}
}
