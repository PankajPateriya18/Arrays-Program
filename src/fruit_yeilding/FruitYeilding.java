/*Program: 37 FRUIT YIELDING TREE
Raju owned a farm which had ‘n’ fruit trees. 
He sold a tree from the farm which yielded the 
utmost number of fruits. Now, he wanted to seek 
out the tree that yielded the second maximum 
number of fruits. Write a program to assist Raju 
find the second largest fruit yielding tree 
without sorting.
public int secondMaximum(int[] arr){
}
Example:
Enter no of values: 4
Enter 4 Values
10
5
6
9
Second largest value is 9*/

package fruit_yeilding;

import java.util.Scanner;

public class FruitYeilding {
	
	static int findSecondMaximum(int[] arr) {
		int i, max=arr[0], sMax=-1;
		for(i=0; i<arr.length; i++) {
			if(max < arr[i]) max = arr[i];
		}
		for(i=0; i<arr.length; i++) {
			if(sMax < max) {
				if(sMax < arr[i] && arr[i] != max) sMax = arr[i];
			}
		}
		return sMax;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total Trees : ");
		int to = sc.nextInt();
		System.out.println("Enter Tree Yeilding");
		int[] arr = new int[to];
		int i;
		for(i=0; i<arr.length; i++) {
			System.out.print((i+1) + " element : ");
			arr[i] = sc.nextInt();
		}
		int sMax = FruitYeilding.findSecondMaximum(arr);
		System.out.println("Second Maximum Yeild is : " + sMax);
	}
}
