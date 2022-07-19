package ArrayPart3;
/*2.	Define a method to return sum of array element. */

import java.util.Scanner;
public class AraySum {
static int SumArray(int x[])
	{
		int sum=0;
		for (int k=0; k<x.length; k++)
		{
			sum=sum+x[k];
		}
		return sum;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter total size of array.");
	int i=sc.nextInt();
	int a[];
	a=new int[i]; //or int a[]=new int[i];
	System.out.println("Enter "+i+" array elements");
	for(int j=0; j<i; j++) {
		a[j]=sc.nextInt();
	}
	int sum=SumArray(a);
	System.out.println("Sum or array elemnt is: "+ sum);	
	}
}
