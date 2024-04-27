package byte_array;

import java.util.Scanner;

public class IntToByte {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size : ");
		int size = sc.nextInt();
		byte[] arr = new byte[size];
		System.out.println("Enter Byte Array Elements");
		int i;
		for(i=0; i<size; i++) {
			System.out.print((i+1) + " element : ");
			arr[i] = (byte)sc.nextInt();
		}
		System.out.print("Byte Elements are : ");
		for(i=0; i<size; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
