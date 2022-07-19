package ArrayPart3;
/*3.	Define a method to print how many even and odd numbers present in the array. */

import java.util.Scanner;
public class EvenOddNumAray {
	static int[] CountEvenOdd(int ar[]) {
		int even=0, odd=0;
		for(int i=0; i<ar.length; i++) {
			if(ar[i]%2==0)
				even++;
			else 
				odd++;
		}
		int count[]= {even,odd};
		return count;
	}
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter total size of array.");
	int i=sc.nextInt();
	int a[];
	a=new int[i];
	System.out.println("Enter the array elements");
	for(int j=0; j<i; j++) {
		a[j]=sc.nextInt();
		}
	int count[]=CountEvenOdd(a);
	System.out.println("Number of odds: "+count[1]+"\nNumber of evens: "+count[0]);
	}
}