package Programs;
/*46.	Define a method to return true if the number is Armstrong number. 
 * Otherwise return false. */

import java.util.Scanner;
public class Program46 
{
	static boolean isArmstrong(int n)
	{	
		int sum=0, temp=n;
		do {
			int r=n%10;
			sum=sum+r*r*r;
			n=n/10;
		}while(n!=0);
		if(temp==sum)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x=sc.nextInt();
		boolean rs=isArmstrong(x);
		System.out.println(x + "is an Armstrong number?: " + rs);
	}
}
