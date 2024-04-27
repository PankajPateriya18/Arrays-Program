package shifting;

import java.util.Scanner;

public class ShiftZeroToEnd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Array Size : ");
		int size = sc.nextInt();
		
		int[] ar = new int[size];
		
		System.out.println("Enter Array Elements");
		int i;
		for(i=0; i<ar.length; i++) {
			System.out.print((i+1)+" element : ");
			ar[i] = sc.nextInt();
		}
		
		System.out.print("Given Array is : [");
		for(i=0; i<ar.length; i++) {
			System.out.print(ar[i]);
			if(i != ar.length-1) System.out.print(", ");
		}System.out.println("]");
		int tp, j;
		for(i=0; i<ar.length; i++) {
			for(j=i+1; j<ar.length; j++) {
				if(ar[i] == 0 && ar[j] != 0) {
					tp = ar[i];
					ar[i] = ar[j];
					ar[j] = tp;
				}
			}
		}
		System.out.print("After Shifting Array is : [");
		for(i=0; i<ar.length; i++) {
			System.out.print(ar[i]);
			if(i != ar.length-1) System.out.print(", ");
		}System.out.println("]");
	}
}
