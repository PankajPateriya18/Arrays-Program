package maximum_sum;
import java.util.Scanner;
public class FindMaximumSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array Size : ");
		int i, j, sum=0, size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter Array Elements");
		for(i=0; i<arr.length; i++) {
			System.out.print((i+1) + " element : ");
			arr[i] = sc.nextInt();
		}
		System.out.print("Array is : [");
		for(i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			if(i != arr.length-1) System.out.print(", ");
		}System.out.println("]");
		
		for(i=0; i<arr.length; i++) {
			for(j=i+1; j<arr.length; j++) {
				if((arr[i]+arr[j]) > sum) sum = arr[i]+arr[j];
			}
		}
		for(i=0; i<arr.length; i++) {
			for(j=i+1; j<arr.length; j++) {
				if((arr[i]+arr[j]) == sum) {
					System.out.println("Maximum Sum of two Elements : " + arr[i] + " + " + arr[j] + " = " + sum );
				}
			}
		}
	}
}
