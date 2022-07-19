package ArrayPart3;
/*8.	Define a method to delete and element from the specified index of an array.*/

import java.util.Scanner;
public class Program8 {
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
static int[] deleteElement(int x[], int pos) {
	if(pos<=0 || pos>x.length) {
		System.out.println("Not possible to delete.");
		return x;
	}
	
		int newArray[]=new int[x.length-1];
		for(int i=0; i<newArray.length; i++) {
			if(i<pos)
				newArray[i]=x[i];
			else
				newArray[i]=x[i+1];
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
System.out.println("Enter the idex you want to delete");
Scanner ob=new Scanner(System.in);
int position=ob.nextInt();
int x[]=deleteElement(a,position);
displayArray(x);
	}
}