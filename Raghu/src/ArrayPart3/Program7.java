package ArrayPart3;
/*7.	Define a method to insert the array element at specific index.*/

import java.util.Scanner;
public class Program7 {
	static int[] readArray() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total size of array.");
		int n=sc.nextInt();
		int ar[];
		ar=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0; i<n; i++) {
			ar[i]=sc.nextInt();
			}
		return ar;
}
static int[] insertElement(int x[], int ele, int pos) {
	if(pos<0 || pos>x.length) {
		System.out.println("NOt possible to insert.");
		return x;
	}
	
		int newArray[]=new int[x.length+1];
		newArray[pos]=ele;
		for(int i=0; i<x.length; i++) {
			if(i<pos)
				newArray[i]=x[i];
			else
				newArray[i+1]=x[i];
		}
	return newArray;
}

static void displayArray(int ar[]) {
	for(int i=0; i<ar.length; i++){
		System.out.print(ar[i] + " ");
	}
}
public static void main(String[] args) {
System.out.println("Read array:");
int a[]=readArray();
System.out.println("Enter the elment and the position you want to insert it to");
Scanner ob=new Scanner(System.in);
int element=ob.nextInt();
int position=ob.nextInt();
int x[]=insertElement(a,element, position);
displayArray(x);
	}
}
