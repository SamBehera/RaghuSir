package ArrayPart3;
/*5.	Define a method to reverse the array..*/

import java.util.Scanner;
public class ReverseArray {
	
static void reverseAray(int ar[]) {
	int i=0, j=ar.length-1;
	while(i<j){
				int temp=ar[i];
				ar[i]=ar[j];
				ar[i]=temp;
				i++;
				j--;
			}
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
		reverseAray(a);
		for(int j=0; j<a.length; j++) {
			System.out.println(a[j] +" ");
		}
	}
}