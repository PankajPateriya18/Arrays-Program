package count_frequency;

import java.util.Scanner;

public class CountFrequency {
	
	static int[] returnFrequency(int[] arr) {
		int[] fr = new int[arr.length];
		int i, j, c;
		for(i=0; i<arr.length; i++) {
			c=1;
			if(arr[i] != -1) {
				for(j=i+1; j<arr.length; j++) {
					if(arr[i] == arr[j]) {
						c++;
						arr[j] = -1;
					}
				}
			}
			fr[i] = c;
		}
		return fr;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array Size : ");
		int size = sc.nextInt();
		int i, j, c;
		int[] arr = new int[size];
		System.out.println("Enter Array Elements");
		for(i=0; i<arr.length; i++) {
			System.out.print((i+1) + " element : ");
			arr[i] = sc.nextInt();
		}
		int[] res = CountFrequency.returnFrequency(arr);
		System.out.println("Elements\t\tFrequency");
		for(i=0; i<res.length; i++) {
			if(arr[i] != -1) {
				System.out.println("   "+arr[i] + "\t\t\t   " + res[i]);
			}
		}
		
	}
}
