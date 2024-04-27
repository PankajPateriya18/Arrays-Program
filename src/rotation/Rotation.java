package rotation;

import java.util.Scanner;

public class Rotation {
	
	static int[] rotation(int[] arr, int rot) {
		int i, tp, j;
		for(i=1; i<=rot; i++) {
			tp=arr[arr.length-1];
			for(j=arr.length-1; j>0; j--) {
				arr[j] = arr[j-1];
			}
			arr[0] = tp;
		}
		return arr;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Array size : ");
		
		int size = sc.nextInt();
		
		int[] ar = new int[size];
		
		System.out.println("Enter Array Elements");
		int i;
		for(i=0; i<ar.length; i++) {
			System.out.print((i+1) + " element : ");
			ar[i] = sc.nextInt();
		}
		
		System.out.print("Enter rotation time : ");
		int rot = sc.nextInt();
		
		int[] res = Rotation.rotation(ar, rot);
		
		System.out.print("After Rotation : ");
		for(i=0; i<res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}
}
