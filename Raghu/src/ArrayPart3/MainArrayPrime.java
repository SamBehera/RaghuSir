package ArrayPart3;

import java.util.Scanner;
public class MainArrayPrime {
	static int CountPrime(int[] ar) {
		int count=0;
		for(int i=0; i<ar.length;i++) {
			boolean rs=isPrimenumber(ar[i]);
			if(rs==true)
				count++;
		}
		return count;
	}	
private	static boolean isPrimenumber(int n){
		for(int i=2; i<=n/2; i++) {
			if(n%i==0)
				return 	false;		
		}return true;	
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
		int cp=CountPrime(a);
		System.out.println("Total prime number in the array is "+ cp);
	}
}
