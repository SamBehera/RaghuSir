package Programs;

import java.util.Scanner;
public class Special2digit 
{
	static boolean IsSpecialTwoDigit(int n)
	{
		int d1=n/10;
		int d2=n%10;
		int sum = d1+d2+d1*d2;
		if(sum==n)
			return true;
		else
			return false;
	}
	
	public static void main(String Arg[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int x = sc.nextInt();
		boolean rs = IsSpecialTwoDigit(x);
		if(rs==true)
			System.out.println(x +" is a special 2 digit number.");
		else
			System.out.println(x +" is not a special 2 digit number.");
	}
}
