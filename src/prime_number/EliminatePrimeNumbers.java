package prime_number;

import java.util.Scanner;

public class EliminatePrimeNumbers {

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
		
		int count=0, c, j, e;
		
		for(i=0; i<arr.length; i++) {
			c=0;
			e = arr[i];
			for(j=1; j<=e; j++) {
				if(e % j == 0) c++;
			}
			if(c == 2) count++;
		}
		
		int[] f = new int[count];
		count=0;
		for(i=0; i<arr.length; i++) {
			c=0;
			e = arr[i];
			for(j=1; j<=e; j++) {
				if(e % j == 0) c++;
			}
			if(c == 2) f[count++] = e; 
		}
		
		System.out.print("Prime Numbers are : [");
		for(i=0; i<f.length; i++) {
			System.out.print(f[i]);
			if(i != f.length-1) System.out.print(", ");
		}System.out.println("]");
	}
}
