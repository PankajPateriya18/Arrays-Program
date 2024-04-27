package find_element;

import java.util.Scanner;

public class FindElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter Array Element");
		int i, sum=0;
		for(i=0; i<arr.length; i++) {
			System.out.print((i+1) + " element : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		int f=size+1;
		for(i=size; i!=0; i--) {
			f = f + i;
		}
		System.out.println("Missing Element is : " + (f-sum));
	}
}
