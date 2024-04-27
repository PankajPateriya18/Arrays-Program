package prime_number;

import java.util.Scanner;

public class StoreNPrimeNumbers {

	public static void main(String[] args) {
		int i;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Array size to Store Prime Numbers : ");

		int size = sc.nextInt();

		int[] arr = new int[size];

		int count=0, c, j;
		for (i=1; ; i++) {
			c=0;
			for(j=1; j<=i; j++) {
				if(i % j == 0) c++;
			}

			if(c == 2) {
				arr[count++] = i;
			}
			
			if(count == size) break;
		}

		System.out.print("\nArray is : [");

		for (i = 0; i < size; i++) {
			System.out.print(arr[i]);
			if (i != size - 1)
				System.out.print(", ");
		}
		System.out.println("]");
	}
}
