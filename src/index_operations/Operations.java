package index_operations;

import java.util.Scanner;

class InsertNewElement {

	static int[] inserting(int[] arr, int element, int position) {
		int i;
		int[] res = new int[arr.length + 1];
		int count = 0;
		for (i = 0; i < res.length; i++) {
			if (i == (position - 1))
				res[i] = element;
			else
				res[i] = arr[count++];
		}
		return res;
	}
}

class DeleteElement {

	static int[] deleting(int[] arr, int position) {
		int i;
		int[] res = new int[arr.length - 1];
		int count = 0;
		for (i = 0; i < arr.length; i++) {
			if(position-1 != i) res[count++] = arr[i];
		}
		return res;
	}
}

public class Operations {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter Array Elements");
		int i, j;int res[]=null;
		for (i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + " Element : ");
			arr[i] = sc.nextInt();
		}
		int element, position;
		do {
			System.out.println("\t1. Inserting new Element");
			System.out.println("\t2. Deleting one Element");
			System.out.print("Choice : ");
			int c = sc.nextInt();
			switch (c) {
			case 1:
				System.out.print("\nEnter element to insert : ");
				element = sc.nextInt();
				System.out.print("\nEnter element position : ");
				position = sc.nextInt();
				res = InsertNewElement.inserting(arr, element, position);
				System.out.print("\nArray is : [");
				for (i = 0; i < res.length; i++) {
					System.out.print(res[i]);
					if (i != res.length - 1)
						System.out.print(", ");
				}
				System.out.println("]");
				break;
			case 2:
				System.out.print("\nEnter element position : ");
				position = sc.nextInt();
				res = DeleteElement.deleting(arr, position);
				System.out.print("\nArray is : [");
				for (i = 0; i < res.length; i++) {
					System.out.print(res[i]);
					if (i != res.length - 1)
						System.out.print(", ");
				}
				System.out.println("]\n");
				break;
			default : System.out.println("Choose Correct Option");
			}
		} while (true);

	}
}
