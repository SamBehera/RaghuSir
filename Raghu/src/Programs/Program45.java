package Programs;
/*45.	Define a method to return the sum of it’s digits. */

import java.util.Scanner;
public class Program45 
{
	static int sumofDIgits(int n)
	{
		int sum=0;
		do {
			int r=n%10;
			sum=sum+r;
			n=n/10;
			}while (n!=0);
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x=sc.nextInt();
		int sum=sumofDIgits(x);
		System.out.println("Sum of the digits of the num is: "+ sum);
	}
}
