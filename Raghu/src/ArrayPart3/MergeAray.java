package ArrayPart3;

/*6.	Define a method to merge 2 array element in to single array. */
import java.util.Scanner;
public class MergeAray {
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
	
static void displayArray(int ar[]) {
	for(int i=0; i<ar.length; i++){
		System.out.print(ar[i] + " ");
	}
}

static int[] mergeAray(int x[],int y[]) {
	int z[]=new int[x.length+y.length];

	for (int i=0; i<x.length; i++) {
		z[i]=x[i];
	}
	for(int i=0; i<y.length;i++) {
		z[i+x.length]=y[i];
	}
	return z; 
}
	
public static void main(String[] args) {
	System.out.println("Read first Array.");
		int a[]=readArray();
	System.out.println("Read second Array.");
		int b[]=readArray();
	System.out.print("Display first Array.");
		displayArray(a);
	System.out.print("\nDisplay second Array.");		
		displayArray(b);
		int []c= mergeAray(a,b);
		System.out.print("\nAfter merge:");
		displayArray(c);
	}
}
