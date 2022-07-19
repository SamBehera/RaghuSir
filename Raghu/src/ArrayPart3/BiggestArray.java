package ArrayPart3;

import java.util.Scanner;
public class BiggestArray {
static int getBiggest(int ar[]) {
		int big=ar[0];
		for(int i=0; i<ar.length;i++) {
			if(ar[i]>big)
			big=ar[i];
		}
		return big;
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
	int bg=getBiggest(a);
	System.out.println("Biggest num in the array is: "+ bg);
	}	
}
