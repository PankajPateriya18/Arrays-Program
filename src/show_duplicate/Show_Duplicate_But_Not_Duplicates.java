package show_duplicate;

import java.util.Scanner;

public class Show_Duplicate_But_Not_Duplicates {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter Array Elements");
		int i;
		for(i=0; i<size; i++) {
			System.out.print((i+1) + " element : ");
			arr[i] = sc.nextInt();
		}
		
		int[] brr = Show_Duplicate_But_Not_Duplicates.collectDuplicate(arr);
		System.out.print("\n\nAll Duplicates are : ");
		for(i=0; i<brr.length; i++) {
			System.out.print(brr[i] + " ");
		}
		
		int[] crr = Show_Duplicate_But_Not_Duplicates.removeDuplicate(brr);
		System.out.print("\n\nAfter Remove Duplicates are : ");
		for(i=0; i<crr.length; i++) {
			System.out.print(crr[i] + " ");
		}
		
	}
	
	static int[] collectDuplicate(int [] a) {
		int i, j, count=0;
		int[] b = new int[a.length];
		for(i=0; i<b.length; i++) {
			b[i] = a[i];
		}
		int len = b.length;
		for(i=0; i<len; i++) {
			for(j=i+1; j<len; j++) {
				if(b[i] == b[j]) {
					b[j] = b[len-1];
					len--; j--;
					count++;
				}
			}
		}
		b = new int[a.length];
		for(i=0; i<b.length; i++) {
			b[i] = a[i];
		}
		len = b.length;
		int[] c = new int[count];
		count=0;
		for(i=0; i<len; i++) {
			for(j=i+1; j<len; j++) {
				if(b[i] == b[j]) {
					c[count++] = b[j];
					b[j] = b[len-1];
					len--;
					j--;
				}
			}
		}
		return c;	
	}
	
	static int[] removeDuplicate(int [] a) {
		int i, j, len=a.length;
		for(i=0; i<len; i++) {
			for(j=i+1; j<len; j++) {
				if(a[i] == a[j]) {
					a[j] = a[len-1];
					len--;
					j--;
				}
			}
		}
		int[] b = new int[len];
		for(i=0; i<len; i++) {
			b[i] = a[i];
		}
		return b;
	}

	
}
